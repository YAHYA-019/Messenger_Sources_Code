package X;

import com.google.common.collect.ImmutableList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4PO, reason: invalid class name */
/* loaded from: 4PO.class */
public final class C4PO extends C4Bq {
    public static final String __redex_internal_original_name = "FallbackSendAnalyticLogsMethod";

    /* JADX WARN: Type inference failed for: r0v2, types: [X.3zw, java.lang.Object] */
    @Override // X.C4Bq
    /* renamed from: A00 */
    public C04103zy B7F(4BS r302) {
        C04103zy B7F = super.B7F(r302);
        ?? obj = new Object();
        obj.A0M = true;
        obj.A07 = 0S2.A00;
        obj.A08 = C04083zw.A0a;
        obj.A04 = EnumC04093zx.A0B;
        obj.A0K = true;
        obj.A0D = B7F.A0H;
        obj.A0E = B7F.A0L;
        obj.A0F = B7F.A0M;
        obj.A0G = B7F.A0N;
        obj.A05 = B7F.A0B;
        1SZ r0 = B7F.A08;
        1MG.A00(r0.A02, (Object) null, AnonymousClass400.A00());
        obj.A0Z = r0;
        if (B7F.A07 != null) {
            throw AnonymousClass001.A0L("Recreating a builder from poolable parameters is not allowed");
        }
        ImmutableList immutableList = B7F.A0C;
        if (immutableList == null) {
            immutableList = ImmutableList.of();
        }
        LinkedList linkedList = new LinkedList();
        2Ri.A0H(immutableList, linkedList);
        obj.A0J = linkedList;
        obj.A06 = B7F.A0D;
        List A01 = B7F.A01();
        if (A01 != null) {
            LinkedList linkedList2 = new LinkedList();
            2Ri.A0H(A01, linkedList2);
            A01 = linkedList2;
        }
        obj.A0I = A01;
        obj.A09 = B7F.A0G;
        obj.A0T = B7F.A0U;
        obj.A0N = B7F.A0Q;
        obj.A0Y = B7F.A0X;
        obj.A0R = B7F.A0T;
        obj.A0H = B7F.A0O;
        obj.A0U = B7F.A0V;
        obj.A0X = B7F.A0W;
        obj.A0O = B7F.A0R;
        obj.A0P = B7F.A0S;
        obj.A0L = B7F.A00;
        obj.A0Q = B7F.A05;
        obj.A0M = B7F.A0P;
        obj.A07 = B7F.A0E;
        obj.A08 = B7F.A0F;
        obj.A00 = B7F.A06;
        obj.A04 = B7F.A0A;
        obj.A0W = B7F.A04;
        obj.A0V = B7F.A03;
        obj.A0C = B7F.A0K;
        obj.A0S = B7F.A02;
        obj.A0X = true;
        obj.A0C = "https://graph.fbpigeon.com";
        obj.A0D = "sendAnalyticsLogFallback";
        obj.A00 = 5000L;
        C04083zw.A00(obj);
        return new C04103zy(obj);
    }
}
