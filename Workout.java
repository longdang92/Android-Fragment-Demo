package vn.supercode.longdang.fragmentdemo;

/**
 * Created by LONGDANG on 8/30/2016.
 */
public class Workout {
    private String name;
    private String des;

    public Workout(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static final Workout[] workouts = {
            new Workout("Mon hoc","Toan\nLy\nHoa"),
            new Workout("Sinh vien","San lui\nChim Oanh Vu"),
            new Workout("Am thuc","Che tu chon\nHoa qua dam\nBanh dua nuong\nTra da NXB"),
            new Workout("CLB","Tieng Anh\nGuitar\nBKMedia\nSao BK\nMauBK"),
    };
}

