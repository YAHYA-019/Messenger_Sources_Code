package X;

import android.net.Uri;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: BUh.class */
public abstract class BUh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List] */
    public static final ImmutableList A00(String str) {
        C0ty c0ty;
        ImmutableList build;
        if (str == null) {
            0fH.A0k("SearchMsysThreadTranscription", "default profile pic url list is null");
            build = ImmutableList.of();
        } else {
            List A03 = new C04t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(str, 0);
            if (!A03.isEmpty()) {
                ListIterator A1F = AbH.A1F(A03);
                while (A1F.hasPrevious()) {
                    if (C3o5.A06(A1F) != 0) {
                        c0ty = C3o5.A0V(A03, A1F);
                        break;
                    }
                }
            }
            c0ty = C0ty.A00;
            String[] A0n = C3o5.A0n(c0ty);
            ImmutableList.Builder builder = ImmutableList.builder();
            for (String str2 : A0n) {
                Uri uri = null;
                try {
                    uri = C0A2.A03(str2);
                } catch (SecurityException unused) {
                }
                builder.m11011add((Object) uri);
            }
            build = builder.build();
        }
        11T.A0A(build);
        return build;
    }
}
