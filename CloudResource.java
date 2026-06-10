public abstract class CloudResource implements Monitorable {

    protected String resourceId;
    protected boolean isActive;

    public CloudResource(String resourceId) {
        this.resourceId = resourceId;
        this.isActive = false;
    }

    public void togglePower() {
        isActive = !isActive;
        String status = isActive ? "ON" : "OFF";
        System.out.println("Resource " + resourceId + " is now " + status);
    }

    public abstract void allocateMemory(int gigabytes);
}
