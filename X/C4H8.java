package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.4H8, reason: invalid class name */
/* loaded from: 4H8.class */
public final class C4H8 implements C4H5 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public final C4H7 A04;

    public C4H8(C4H7 c4h7) {
        this.A04 = c4h7;
    }

    @Override // X.C4H5
    public ImmutableMap ACn() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        C4Gc c4Gc = this.A04.A00;
        long j = c4Gc.A00;
        builder.put("currentTimeEpochMillis", String.valueOf(j));
        Long l = this.A01;
        if (l != null) {
            builder.put("lastDismissalEpochMillis", String.valueOf(l.longValue()));
            builder.put("surfaceCoolDownMillis", String.valueOf(c4Gc.A04));
        }
        Long l2 = this.A00;
        if (l2 != null) {
            builder.put("dismissDeltaMillis", String.valueOf(j - l2.longValue()));
        }
        Long l3 = this.A02;
        if (l3 != null) {
            builder.put("lastImpressionEpochMillis", String.valueOf(l3.longValue()));
            builder.put("minImpressionDelayMillis", String.valueOf(c4Gc.A02));
        }
        Long l4 = this.A03;
        if (l4 != null) {
            builder.put("impressionDeltaMillis", String.valueOf(j - l4.longValue()));
        }
        ImmutableMap build = builder.build();
        11T.A0A(build);
        return build;
    }
}
