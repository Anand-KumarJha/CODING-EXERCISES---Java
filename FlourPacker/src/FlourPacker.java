public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        return ((bigCount >= 0 && smallCount >= 0 && goal > 0) && (goal <= 5*bigCount + smallCount) && (smallCount >= goal%5));
    }
}