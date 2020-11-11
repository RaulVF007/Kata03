package kata03;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay(String title) {
        super(title);
        this.setContentPane(createPanel());
        this.pack(); //Con este método la ventana se ajusta y responde a todas las interacciones de redimensión de tamaño
        
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("JFreeChart Histogram",
                "Email domains", "Nº emails",
                dataset, PlotOrientation.VERTICAL, false, 
                false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(23, "", "ulpgc.es");
        dataset.addValue(32, "", "dis.ulpgc.es");
        dataset.addValue(2, "", "ull.es");
        dataset.addValue(39, "", "gmail.com");
        dataset.addValue(9, "", "hotmail.com");
        
        return dataset;
    }
    
    public void execute(){
        this.setVisible(true);
    }    
}