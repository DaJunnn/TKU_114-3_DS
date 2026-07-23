public class Course {
    private String code;
    private String name;
    private int capacity;
    private int currentStudents;

    public Course(String code, String name, int capacity) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.currentStudents = 0;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentStudents() {
        return currentStudents;
    }

    public boolean isFull() {
        return currentStudents >= capacity;
    }

    public boolean registerStudent() {
        if (isFull()) {
            return false;
        }

        currentStudents++;
        return true;
    }

    public boolean withdrawStudent() {
        if (currentStudents <= 0) {
            return false;
        }

        currentStudents--;
        return true;
    }

    public int getRemainingSeats() {
        return capacity - currentStudents;
    }

    @Override
    public String toString() {
        String status;

        if (isFull()) {
            status = "額滿";
        } else {
            status = "可選課";
        }

        return "課程代碼：" + code
                + "，課程名稱：" + name
                + "，容量：" + capacity
                + "，目前人數：" + currentStudents
                + "，剩餘名額：" + getRemainingSeats()
                + "，狀態：" + status;
    }
}