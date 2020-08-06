package com.sda.zad16;

public enum Runner {

    BEGINNER(181L, Long.MAX_VALUE),
    INTERMEDIATE(151L,180L),
    ADVANCED(120L,150L);

    private long minTime;
    private long maxTime;

        Runner(long minTime, long maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime; }

        public static Runner getFitnessLevel(long runningTime){
        return (runningTime <= 150L) ? ADVANCED : (runningTime <= 180L) ? INTERMEDIATE : BEGINNER; }


}
