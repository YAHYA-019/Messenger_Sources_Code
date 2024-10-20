package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedcontent.plugins.advancedcryptomedia.tabcontent.AdvancedCryptoSharedMediaTabContentImplementation;
import com.facebook.messaging.sharedimage.SharedMedia;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8mu, reason: invalid class name */
/* loaded from: 8mu.class */
public final class C8mu extends C1rj {
    public static final CallerContext A03 = CallerContext.A0C("M4SharedContentItemSpec", "M4SharedContentItem");
    public static final CallerContext A04 = CallerContext.A0E("M4SharedContentItemSpecVideo", "M4SharedContentItem", "VIDEO");
    public 9Kl A00;
    public C5fv A01;
    public List A02;

    public C8mu() {
        super("SharedContentItem");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, null, this.A01, this.A02};
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01db  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0z(X.1Iw r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8mu.A0z(X.1Iw, int, int):X.1LI");
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        ImmutableList immutableList;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 2096925462) {
            return null;
        }
        C8mu c8mu = (C8mu) r302.A00.A01;
        5gR r0 = c8mu.A01;
        List list = c8mu.A02;
        9Kl r02 = c8mu.A00;
        1BL.A1H(r0, list, r02);
        AdvancedCryptoSharedMediaTabContentImplementation advancedCryptoSharedMediaTabContentImplementation = r02.A00.A02.A00.A00;
        Context A0A = 7zL.A0A(advancedCryptoSharedMediaTabContentImplementation.A0M);
        06Z r03 = advancedCryptoSharedMediaTabContentImplementation.A0D;
        ThreadKey threadKey = advancedCryptoSharedMediaTabContentImplementation.A0P;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj2 : list) {
            5gR r04 = (C5fv) obj2;
            if (r04 instanceof C5ft) {
                ImmutableList immutableList2 = ((C5ft) r04).A01;
                if (immutableList2 != null && !immutableList2.isEmpty()) {
                    A0s.add(obj2);
                }
                0fH.A0j("armadillo_thread_gallery", "Filtering out invalid message from SharedMediaFiles.");
            } else {
                if ((r04 instanceof 5gR) && r04.A00 != null) {
                    A0s.add(obj2);
                }
                0fH.A0j("armadillo_thread_gallery", "Filtering out invalid message from SharedMediaFiles.");
            }
        }
        ArrayList A0z = 1BL.A0z(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            A0z.add(SharedMedia.A03(threadKey, (C5fv) it.next(), 0));
        }
        ImmutableList A00 = 0DW.A00(A0z);
        SharedMedia A032 = SharedMedia.A03(threadKey, r0, 0);
        C95o c95o = C95o.A04;
        C5ft c5ft = r0 instanceof C5ft ? (C5ft) r0 : null;
        boolean z = false;
        if (c5ft != null && (immutableList = c5ft.A01) != null && 1BK.A1Y(immutableList)) {
            z = ((Photo) ((C5ft) r0).A01.get(0)).A0G;
        } else if (r0 instanceof 5gR) {
            z = r0.A00.A0L;
        }
        9DK.A00(A0A, r03, threadKey, c95o, A032, A00, "armadillo_thread_gallery", (Function1) null, 0, z, false, false);
        advancedCryptoSharedMediaTabContentImplementation.A0S.A03(AdvancedCryptoSharedMediaTabContentImplementation.A0e);
        return null;
    }
}
