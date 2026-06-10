public class DatabaseNode extends CloudResource {

    private int storageCapacityGb;

    public DatabaseNode(String resourceId, int storageCapacityGb) {
        super(resourceId);
        this.storageCapacityGb = storageCapacityGb;
    }

    @Override
    public void allocateMemory(int gigabytes) {
        System.out.println("Reserving " + gigabytes + " GB RAM for database indexing.");
    }

    @Override
    public String generateHealthReport() {
        if (isActive) {
            return "DatabaseNode " + resourceId + " - Status: Running | Storage: " + storageCapacityGb + " GB";
        } else {
            return "DatabaseNode " + resourceId + " - Status: Offline";
        }
    }

    @Override
    public int getUptime() {
        return 48;
    }
}
