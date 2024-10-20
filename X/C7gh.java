package X;

/* renamed from: X.7gh, reason: invalid class name */
/* loaded from: 7gh.class */
public abstract class C7gh extends 6Cy {
    public final long creationTime;
    public final long eventId;
    public final boolean isLocallyCached;
    public final String loapStreamId;
    public final int loapStreamType;
    public final java.util.Map metadata;
    public final String parentSource;
    public final String severity;
    public final String source;
    public final long traceId;
    public final String videoId;

    public C7gh(5Mw r302, 6Cz r303, String str, String str2, String str3, int i, int i2, long j, long j2, boolean z) {
        super(r303);
        this.videoId = r302.A05;
        this.traceId = r302.A07[i].A01;
        this.source = str;
        this.parentSource = str2;
        this.severity = r302.A03;
        this.eventId = j;
        this.loapStreamId = str3;
        this.loapStreamType = i2;
        this.creationTime = j2;
        this.metadata = r302.A06;
        this.isLocallyCached = z;
    }
}
