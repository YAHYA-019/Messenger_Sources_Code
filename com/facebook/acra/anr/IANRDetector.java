package com.facebook.acra.anr;

/* loaded from: IANRDetector.class */
public interface IANRDetector {

    /* loaded from: IANRDetector$ANRDetectorStopListener.class */
    public interface ANRDetectorStopListener {
        void onStop();
    }

    long getANRReceivedTime();

    long getANRReceivedUpTime();

    void nativeLibraryLoaded(boolean z);

    void pause();

    void resume();

    void setANRReportProvider(ANRReportProvider aNRReportProvider);

    void setCheckIntervalMs(long j);

    void setListener(ANRDetectorListener aNRDetectorListener);

    void start();

    void stop(ANRDetectorStopListener aNRDetectorStopListener);
}
