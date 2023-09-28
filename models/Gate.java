package models;

public class Gate extends BaseModel{
    private int gateNumber;

    private String  operator;

    private Status status;

    private GateTYpe gateTYpe;

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public String  getOperator() {
        return operator;
    }

    public void setOperator(String  operator) {
        this.operator = operator;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public GateTYpe getGateTYpe() {
        return gateTYpe;
    }

    public void setGateTYpe(GateTYpe gateTYpe) {
        this.gateTYpe = gateTYpe;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    private int floorNumber;

}
