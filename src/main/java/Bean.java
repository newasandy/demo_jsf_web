import org.primefaces.model.chart.DonutChartModel;
import org.primefaces.model.chart.PieChartModel;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@Named
@ViewScoped
public class Bean implements Serializable {
    private DonutChartModel model;

    public Bean() {
        model = new DonutChartModel();
        Map<String, Number> circle1 = new LinkedHashMap<String, Number>();
        circle1.put("Brand 1", 150);
        circle1.put("Brand 2", 400);
        model.addCircle(circle1);

        model.setTitle("Donut Chart");
        model.setLegendPosition("w");
    }
    public DonutChartModel getModel() {
        return model;
    }
}