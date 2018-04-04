package berlinclock.service;

import berlinclock.model.HourRequest;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class HourService {

    private static int maxColsInRow = 11;

    public  String[] timeToBerlinClock(HourRequest hourRequest) {

        return berlinClock(hourRequest.getTime());
    }
    public  String[] recentToBerlinClock() {

        return berlinClock(dateToString());
    }

    public String[] berlinClock(String time) {
        String[] times = time.split(":", 3);

        if (times.length != 3) {
            throw new IllegalArgumentException("INVALID_TIME_ERROR");
        }
        int hours, minutes, seconds = 0;

        hours = Integer.parseInt(times[0]);
        minutes = Integer.parseInt(times[1]);
        seconds = Integer.parseInt(times[2]);

        int fh = Math.round(hours / 5);
        int h = (hours % 5);
        int qm = Math.round(minutes / 5);
        int m = (minutes % 5);
        int s = (seconds % 2);


        String[] berlin = {
                rowStringViaInteger(s, 1),
                rowStringViaInteger(fh, 4),
                rowStringViaInteger(h, 4),
                rowStringViaInteger(qm, 11).replaceAll("R", "Y").replaceAll("YYY","YYR"),
                rowStringViaInteger(m, 4).replaceAll("R", "Y"),
        };

        return berlin;
    }

    public static String rowStringViaInteger(int cols, int maxCols) {
        String row = "";


        int whiteSpace = maxColsInRow - maxCols;
        for (int i = 0; i < whiteSpace / 2; i++) row += " ";

        for (int i = 0; i < cols; i++) {
            row += "R";
        }
        for (int i = 0; i < maxCols - cols; i++) {
            row += "B";
        }
        return row;
    }

    public String dateToString() {

        DateFormat dt = new SimpleDateFormat("hh:mm:ss");

        Date now = new Date();

        return dt.format(now);


    }


}


