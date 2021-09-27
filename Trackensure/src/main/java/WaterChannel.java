import java.util.Arrays;
import java.util.List;

//TODO Finish in future...
public class WaterChannel {

    public static void main(String[] args) {
        Integer channel[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        List<Integer> channelList = Arrays.asList(channel);

        Integer sum = 0;

        int startToCalculate = 0;
        int endOfCalculate = 0;
        for (int i = 1; i < channelList.size(); i++) {

            if(channelList.get(i-1) < channelList.get(i)){
                startToCalculate = channelList.get(i);
            }
            if(channelList.get(i-1) > channelList.get(i)){
                startToCalculate = channelList.get(i);
            }


        }

    }




}
