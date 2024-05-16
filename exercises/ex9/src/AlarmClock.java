

public class AlarmClock extends Clock {

    private int alarmHours, alarmMinutes;

    public AlarmClock () {
        super();
    }
    public AlarmClock (int h, int m) {
        super(h, m);
    }
    public AlarmClock (int h, int m, int s) {
        super(h, m, s);
    }
    public int getAlarmHours () {
        return alarmHours;
    }
    public int getAlarmMinutes () {
        return alarmMinutes;

    }
    public void setAlarm (int h, int m) {
        if (h < 0 || h > 23) {
            throw new IllegalArgumentException("Invalid alarm hours");
        }
        if (m < 0 || m > 59) {
            throw new IllegalArgumentException("Invalid alarm minutes");
        }
        alarmHours = h;
        alarmMinutes = m;
    }
    public boolean isRinging () {
        if (getSeconds() < 15 && getSeconds() >= 0) {
            return alarmHours == getAlarmHours() && alarmMinutes == getAlarmMinutes();
        }
        return false;
    }
    @Override
    public void display () {
        if (isRinging() && getHours() < 10) {
            System.out.printf("0%d:%d:00 - WAKE UP!", getAlarmHours(), getAlarmMinutes());
        }
        if (isRinging() && getHours() > 9) {
            System.out.printf("%d:%d:00 - WAKE UP!", getAlarmHours(), getAlarmMinutes());
        }
    }
}
