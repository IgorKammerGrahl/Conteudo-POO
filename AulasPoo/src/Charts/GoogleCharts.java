package Charts;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class GoogleCharts {

    public static void main(String[] args) {
        String path = Paths.get("C:\\Users\\Igor Kammer Grahl\\eclipse-workspace\\AulasPoo\\src\\Charts\\chart.html").toString();
        String htmlContent = generateChartHTML();

        try (FileWriter writer = new FileWriter(path)) {
            writer.write(htmlContent);
            System.out.println("HTML gerado com sucesso");
        } catch (IOException e) {
            System.out.println("Um erro ocorreu enquanto gerava o arquivo");
            e.printStackTrace();
        }

        System.out.println("HTML gerado em: " + path);
    }

    public static String generateChartHTML() {
        return "<html>\n" +
                "  <head>\n" +
                "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
                "    <script type=\"text/javascript\">\n" +
                "      google.charts.load('current', {'packages':['corechart']});\n" +
                "      google.charts.setOnLoadCallback(drawChart);\n" +
                "      function drawChart() {\n" +
                "        var data = google.visualization.arrayToDataTable([\n" +
                "          ['Year', 'Sales', 'malalaca'],\n" +
                "          ['2016', 1020, 300],\n" +
                "          ['2017', 210, 4500],\n" +
                "          ['2018', 4660, 1020],\n" +
                "          ['2019', 30, 400]\n" +
                "        ]);\n" +		   
                "        var options = {\n" +
                "          title: 'Company Performance',\n" +
                "          curveType: 'function',\n" +
                "          legend: { position: 'bottom' }\n" +
                "        };\n" +
                "        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\n" +
                "        chart.draw(data, options);\n" +
                "      }\n" +
                "    </script>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div>\n" +
                "  </body>\n" +
                "</html>";
    }
}
