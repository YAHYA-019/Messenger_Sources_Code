package X;

import com.facebook.messaging.groups.invitelink.join.model.GroupInviteLinkData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.6mh, reason: invalid class name */
/* loaded from: 6mh.class */
public final class C6mh {
    public final 1Br A03 = 1Bq.A00(16520);
    public final 1Br A00 = 1Bq.A00(66251);
    public final C01i A02 = C01g.A01(new C82y(this, 11));
    public final C01i A01 = C01g.A01(new C82y(this, 10));

    public static final QuickPerformanceLogger A00(C6mh c6mh) {
        return (QuickPerformanceLogger) c6mh.A03.A00.get();
    }

    public final void A01() {
        if (A00(this).isMarkerOn(947008942)) {
            A00(this).markerEnd(947008942, (short) 3);
        }
    }

    public final void A02() {
        if (A00(this).isMarkerOn(947009982)) {
            A00(this).markerDrop(947009982);
        }
    }

    public final void A03(GroupInviteLinkData groupInviteLinkData) {
        A00(this).markerStart(946996509, true);
        C96j c96j = groupInviteLinkData.A04;
        A00(this).markerAnnotate(946996509, "channel_type", c96j == C96j.A06 ? "social" : c96j == C96j.A05 ? "broadcast" : "default");
        A00(this).markerAnnotate(946996509, "requires_admin_approval", groupInviteLinkData.A0L);
        A00(this).markerAnnotate(946996509, "query_type", (String) this.A01.getValue());
        A00(this).markerAnnotate(946996509, "is_channel_preview", ConstantsKt.CAMERA_ID_FRONT);
    }

    public final void A04(ThreadKey threadKey, String str) {
        if (A00(this).isMarkerOn(947008942) && threadKey != null && threadKey.A11()) {
            String str2 = threadKey.A1D() ? "broadcast" : "social";
            A00(this).markerPoint(947008942, str);
            A00(this).markerAnnotate(947008942, "channel_type", str2);
        }
    }

    public final void A05(ThreadSummary threadSummary, String str) {
        if (!A00(this).isMarkerOn(947008942) || threadSummary == null) {
            return;
        }
        A00(this).markerPoint(947008942, str);
        A00(this).markerAnnotate(947008942, "channel_type", threadSummary.A0n.A1D() ? "broadcast" : "social");
    }

    public final void A06(ThreadSummary threadSummary, String str) {
        if (!A00(this).isMarkerOn(947008942) || threadSummary == null) {
            return;
        }
        A00(this).markerPoint(947008942, str);
        String str2 = threadSummary.A0n.A1D() ? "broadcast" : "social";
        A00(this).markerAnnotate(947008942, "is_thread_preview_loaded", true);
        A00(this).markerAnnotate(947008942, "channel_type", str2);
    }

    public final void A07(ThreadViewParams threadViewParams, String str) {
        if (!A00(this).isMarkerOn(947008942) || threadViewParams == null) {
            return;
        }
        String str2 = threadViewParams.A0B == C6en.A02 ? "broadcast" : "social";
        A00(this).markerPoint(947008942, str);
        A00(this).markerAnnotate(947008942, "channel_type", str2);
    }

    public final void A08(String str) {
        A00(this).markerStart(947009982, true);
        A00(this).markerAnnotate(947009982, "join_entry_point", str);
        A00(this).markerAnnotate(947009982, "query_type", (String) this.A02.getValue());
    }

    public final void A09(String str) {
        if (A00(this).isMarkerOn(947008942)) {
            A00(this).markerPoint(947008942, str);
        }
    }

    public final void A0A(String str) {
        A00(this).markerAnnotate(947009982, "error", str);
        A00(this).markerEnd(947009982, (short) 3);
    }

    public final void A0B(boolean z, String str) {
        short s;
        QuickPerformanceLogger A00 = A00(this);
        if (z) {
            s = 2;
        } else {
            if (str == null) {
                str = "";
            }
            A00.markerAnnotate(946996509, "error", str);
            A00 = A00(this);
            s = 3;
        }
        A00.markerEnd(946996509, s);
    }
}
