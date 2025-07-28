import java.time.LocalDateTime;

enum Berth {
    UPPER,
    MIDDLE,
    LOWER
}

public class Passenger {
    int PID;
    String Name;
    Berth prefBerth;
    Berth allocatedBerth;
    LocalDateTime bookedTime;

//Getters and Setters
    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Berth getPrefBerth() {
        return prefBerth;
    }

    public void setPrefBerth(Berth prefBerth) {
        this.prefBerth = prefBerth;
    }

    public Berth getAllocatedBerth() {
        return allocatedBerth;
    }

    public void setAllocatedBerth(Berth allocatedBerth) {
        this.allocatedBerth = allocatedBerth;
    }

    public LocalDateTime getBookedTime() {
        return bookedTime;
    }

    public void setBookedTime(LocalDateTime bookedTime) {
        this.bookedTime = bookedTime;
    }


    public String toString() {
        return "PID: " + PID + ", Name: " + Name + ", Pref: " + prefBerth + ", Allocated: " + allocatedBerth+", Time: "+bookedTime;
    }
}
