public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        int remainingBucketsNeeded;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }else {

            double area = width * height;
            int totalBucketsNeeded = (int)(Math.ceil(area / areaPerBucket));
            remainingBucketsNeeded = totalBucketsNeeded - extraBuckets;

        }return remainingBucketsNeeded;


    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        int remainingBucketsNeeded;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }else {

            double area = width * height;
            remainingBucketsNeeded = (int)(Math.ceil(area / areaPerBucket));

        }return remainingBucketsNeeded;

    }

    public static int getBucketCount(double area, double areaPerBucket){

        int remainingBucketsNeeded;

        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }else {

            remainingBucketsNeeded = (int)(Math.ceil(area / areaPerBucket));

        }return remainingBucketsNeeded;

    }

}
