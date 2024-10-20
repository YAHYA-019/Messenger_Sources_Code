package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.9hd, reason: invalid class name */
/* loaded from: 9hd.class */
public final class C9hd {
    public static final ImmutableMap A01;
    public static final ImmutableMap A02;
    public static final int[] A03 = {-65536, -16776961, -256};
    public final 1Br A00 = 1Bq.A00(67924);

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put("love", "❤️");
        builder.put("haha", "��");
        builder.put("like", "��");
        builder.put("wow", "��");
        builder.put("sad", "��");
        builder.put("angry", "��");
        A02 = builder.build();
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder();
        builder2.put(new String[]{"��", "❤️", "��", "��", "��", "��", "��"}[6], 2132347198);
        A01 = builder2.build();
    }

    public final int A00(String str) {
        int indexOf = A01().indexOf(str);
        if (indexOf < 0) {
            return -256;
        }
        return A03[indexOf % 3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List] */
    public final ImmutableList A01() {
        C0ty c0ty;
        List A032 = new C04t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(2yD.A02(1BK.A0N(((C9Jn) 1Br.A0B(this.A00)).A00), 36879642925269926L), 0);
        if (!A032.isEmpty()) {
            ListIterator listIterator = A032.listIterator(A032.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    c0ty = 0QD.A0Y(A032, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        c0ty = C0ty.A00;
        String[] A0n = C3o5.A0n(c0ty);
        ImmutableList.Builder A0h = 4YU.A0h();
        for (String str : A0n) {
            Object obj = A02.get(str);
            if (obj != null) {
                A0h.m11011add(obj);
            }
        }
        return 1Fj.A01(A0h);
    }
}
