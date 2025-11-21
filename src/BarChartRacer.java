/*************************************************************************
 *  Compilation:  javac BarChartRacer.java
 *  Execution:    java BarChartRacer filename k
 *
 *  Produce an animated bar chart from the given file, showing the top k
 *  bars for each time period, using the Bar and BarChart data types.
 *************************************************************************/

import java.util.Arrays;

public class BarChartRacer {

    public static void main(String[] args) {

        if (args.length < 2) {
            throw new IllegalArgumentException("Usage: java BarChartRacer <filename> <k>");
        }

        String filename = args[0];
        int k = Integer.parseInt(args[1]);

        In in = new In(filename);

        // header lines
        String title = in.readLine();
        String xAxisLabel = in.readLine();
        String dataSource = in.readLine();

        // create chart
        BarChart chart = new BarChart(title, xAxisLabel, dataSource);

        // standard draw setup
        StdDraw.setCanvasSize(1000, 700);
        StdDraw.enableDoubleBuffering();

        // skip blank line after header
        in.readLine();

        while (in.hasNextLine()) {

            String line = in.readLine();
            if (line == null) break;
            if (line.length() == 0) continue;

            int n = Integer.parseInt(line);
            Bar[] bars = new Bar[n];
            String caption = "";

            for (int i = 0; i < n; i++) {
                String record = in.readLine();
                String[] fields = record.split(",", 5);

                String year = fields[0].trim();
                String name = fields[1].trim();
                /* String country = fields[2].trim(); // unused */
                int value = Integer.parseInt(fields[3].trim());
                String category = fields[4].trim();

                bars[i] = new Bar(name, value, category);
                // caption is the year (or date)
                caption = year;
            }

            // sort bars in ascending order by value (because Bar.compareTo does that)
            Arrays.sort(bars);

            // prepare chart for this frame
            chart.reset();
            chart.setCaption(caption);

            // add top k bars (largest values) to chart, from biggest to smallest
            int limit = Math.min(k, n);
            for (int i = n - 1; i >= n - limit; i--) {
                Bar b = bars[i];
                chart.add(b.getName(), b.getValue(), b.getCategory());
            }

            chart.draw();
            StdDraw.show();
            StdDraw.pause(100);

            // skip blank line between groups if present
            if (in.hasNextLine()) {
                // do nothing; the next loop iteration will consume it
            }
        }
    }
}
