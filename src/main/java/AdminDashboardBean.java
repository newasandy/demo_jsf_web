import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean(name = "adminDashboardBean")
@ViewScoped
public class AdminDashboardBean implements Serializable {
    private int totalUsers;
    private int totalRooms;
    private int allocatedRooms;
    private int totalVisitors;

    public AdminDashboardBean() {
        // Fetch data from DB or service
        this.totalUsers = 120;  // Example data
        this.totalRooms = 50;
        this.allocatedRooms = 35;
        this.totalVisitors = 200;
    }

    // Getters
    public int getTotalUsers() { return totalUsers; }
    public int getTotalRooms() { return totalRooms; }
    public int getAllocatedRooms() { return allocatedRooms; }
    public int getTotalVisitors() { return totalVisitors; }
}

