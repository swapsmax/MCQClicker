out.println("<html>");
  out.println("<head>");
    out.println("<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>");
    out.println("<script type="text/javascript">");
      out.println("google.charts.load('current', {'packages':['bar']});");
      out.println("google.charts.setOnLoadCallback(drawChart);");

      out.println("function drawChart() {");
        out.println("var data = google.visualization.arrayToDataTable([");
          out.println("['Year', 'Sales', 'Expenses', 'Profit'],");
          out.println("['2014', 1000, 400, 200],");
          out.println("['2015', 1170, 460, 250],");
          out.println("['2016', 660, 1120, 300],");
          out.println("['2017', 1030, 540, 350]");
        out.println("]);");

        out.println("var options = {");
          out.println("chart: {");
            out.println("title: 'Company Performance',");
            out.println("subtitle: 'Sales, Expenses, and Profit: 2014-2017',");
          out.println("},");
          out.println("bars: 'horizontal' // Required for Material Bar Charts.");
        out.println("};");

        out.println("var chart = new google.charts.Bar(document.getElementById('barchart_material'));");

        out.println("chart.draw(data, google.charts.Bar.convertOptions(options));");
      out.println("}");
    out.println("</script>");
  out.println("</head>");
  out.println("<body>");
    out.println("<div id="barchart_material" style="width: 900px; height: 500px;"></div>");
  out.println("</body>");
out.println("</html>");
