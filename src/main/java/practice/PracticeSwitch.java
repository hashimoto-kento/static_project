package practice;

public class PracticeSwitch {

    public static void main(String[] args) {
 
        int[] job = new int[10];
        
        for (int i = 0; i < job.length; i++) {
            int randomJob = (int)(Math.random() * 5) + 1;
            
            job[i] = randomJob;
        }
        
        for (int i = 0; i < job.length; i++) {
            System.out.println(job[i] + getJobName(job[i]));
        }
    }
    public static String getJobName(int jobNumber) {
        switch (jobNumber) {
        case 1:
            return "勇者";
            
        case 2:
            return "バトルマスター";
            
        case 3:
            return "パラディン";
            
        case 4:
            return "海賊";
            
        case 5:
            return "魔法剣士";
            
        default:
            return "";
        }
    }
}

