package X;

/* loaded from: JMM.class */
public interface JMM {
    long AU3();

    void flowAnnotate(long j, String str, String str2);

    void flowAnnotateWithCrucialData(long j, String str, String str2);

    void flowEndCancel(long j, String str);

    void flowEndFail(long j, String str, String str2);

    void flowEndSuccess(long j);

    void flowStart(long j, String str, boolean z);
}
