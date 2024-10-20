package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.Header;

/* renamed from: X.3sa, reason: invalid class name */
/* loaded from: 3sa.class */
public final class C3sa extends C3sb implements InterfaceC01633sc {
    public ViewerContext A00;
    public CallerContext A01;
    public C3sg A02;
    public 1SZ A03;
    public boolean A04;

    /* JADX WARN: Type inference failed for: r0v18, types: [X.3sb, X.3sa] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, X.1SZ] */
    public static C3sa A00(2Jf r301) {
        if (r301 instanceof C01643sd) {
            throw AnonymousClass001.A0L(0Pz.A0z("Trying to create a ", "GraphQLRequest", " from a ", "TypedGraphQLMutationString", ". Use createMutationRequest() instead."));
        }
        r301.A02(Integer.valueOf((AbstractC01653se.A00() * 40) / ActionId.OFFLINE), "profile_image_small_size");
        r301.A02(Integer.valueOf((AbstractC01653se.A00() * 94) / ActionId.OFFLINE), "profile_image_big_size");
        r301.A02(AbstractC01653se.A01(), "scale");
        ?? c3sb = new C3sb(r301);
        c3sb.A02 = C3sg.A00;
        c3sb.A04 = false;
        r301.A0F = true;
        String str = r301.A08;
        if (str == null) {
            str = "unknown";
        }
        ?? obj = new Object();
        ((1SZ) obj).A01 = str;
        ((1SZ) obj).A03 = null;
        ((1SZ) obj).A02 = new AtomicReference(null);
        c3sb.A03 = obj;
        return c3sb;
    }

    @Override // X.C3sb
    public /* bridge */ /* synthetic */ C3sb A05(int i) {
        super.A05(i);
        return this;
    }

    @Override // X.C3sb
    public /* bridge */ /* synthetic */ C3sb A07(String str) {
        super.A07(str);
        return this;
    }

    public void A08(int i) {
        super.A05(i);
    }

    public void A09(long j) {
        super.A02 = j * 1000;
    }

    public void A0A(long j) {
        super.A03 = j * 1000;
    }

    public final void A0B(ImmutableList immutableList) {
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                Header header = (Header) it.next();
                super.A03(header.getName(), header.getValue());
            }
        }
    }

    public void A0C(String str) {
        super.A07(str);
    }

    @Override // X.InterfaceC01633sc
    public ViewerContext BKF() {
        return this.A00;
    }

    @Override // X.C3sb, X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setNetworkTimeoutSeconds(int i) {
        super.A05(i);
        return this;
    }
}
