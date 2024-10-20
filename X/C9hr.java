package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.storagemanagement.mediamanager.model.MediaItem;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9hr, reason: invalid class name */
/* loaded from: 9hr.class */
public final class C9hr {
    public MutableLiveData A00;
    public Long A01;
    public Long A02;
    public final MutableLiveData A03;
    public final MutableLiveData A04;
    public final MutableLiveData A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final List A09;
    public final FbUserSession A0A;

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v22, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public C9hr(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A0A = fbUserSession;
        this.A06 = 7zM.A0Z();
        this.A08 = 7zM.A0R();
        this.A03 = new LiveData(C0ty.A00);
        this.A04 = new LiveData(AnonymousClass001.A0s());
        this.A09 = AnonymousClass001.A0s();
        this.A05 = new LiveData(AnonymousClass966.A05);
        this.A00 = new LiveData(96V.A02);
        this.A07 = 1Lm.A01(fbUserSession, 67992);
    }

    public static final void A00(Context context, C9hr c9hr) {
        List list = (List) c9hr.A04.getValue();
        if (list == null) {
            list = C0ty.A00;
        }
        ATQ atq = ATQ.A00;
        ArrayList<MediaItem> A0z = 7zO.A0z(atq, 2);
        ArrayList<MediaItem> A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            MediaItem mediaItem = (MediaItem) obj;
            11T.A0F(mediaItem, 0);
            if (11T.A0O(mediaItem.A08, "video/mp4")) {
                A0z.add(obj);
            } else {
                A0s.add(obj);
            }
        }
        ArrayList A0z2 = 1BL.A0z(A0s);
        for (MediaItem mediaItem2 : A0s) {
            String str = mediaItem2.A07;
            11T.A0A(str);
            A0z2.add(new 8L1(str, mediaItem2.A08, mediaItem2.A06, 2));
        }
        IDb iDb = (IDb) 1Bn.A0E(context, (1BY) null, 67683);
        for (MediaItem mediaItem3 : A0z) {
            String str2 = mediaItem3.A07;
            11T.A0A(str2);
            Uri parse = Uri.parse(str2);
            String str3 = mediaItem3.A06;
            11T.A0F(parse, 1);
            IDb.A02(context, (Fragment) null, iDb, new J8s(context, parse, iDb, str3, atq, false));
        }
        ((IDb) 1Bn.A0E(context, (1BY) null, 67683)).A07(context, (Fragment) null, A0z2, atq, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.common.util.concurrent.ListenableFuture] */
    public final void A01() {
        SettableFuture A00;
        1Br r0 = this.A06;
        7zP.A0O(r0).A00(this.A05, AnonymousClass966.A05);
        7zP.A0O(r0).A00(this.A04, AnonymousClass001.A0s());
        C0dp A0G = 7zR.A0G();
        Long l = this.A02;
        if (l == null || l.longValue() < 0) {
            96V r02 = (96V) this.A00.getValue();
            if (r02 != null) {
                int ordinal = r02.ordinal();
                if (ordinal == 1) {
                    A00 = 9mQ.A02((9mQ) 1Br.A0B(this.A07), this.A01, A0G.now(), false);
                } else if (ordinal == 2) {
                    A00 = 9mQ.A02((9mQ) 1Br.A0B(this.A07), this.A01, A0G.now(), true);
                }
            }
            A00 = 9mQ.A00((9mQ) 1Br.A0B(this.A07), this.A01, 100);
        } else {
            96V r03 = (96V) this.A00.getValue();
            if (r03 != null) {
                int ordinal2 = r03.ordinal();
                if (ordinal2 == 1) {
                    A00 = 9mQ.A01((9mQ) 1Br.A0B(this.A07), this.A01, l.longValue(), A0G.now(), false);
                } else if (ordinal2 == 2) {
                    A00 = 9mQ.A01((9mQ) 1Br.A0B(this.A07), this.A01, l.longValue(), A0G.now(), true);
                }
            }
            9mQ r04 = (9mQ) 1Br.A0B(this.A07);
            long longValue = l.longValue();
            Long l2 = this.A01;
            A00 = 4YU.A0j();
            A1f A002 = A1f.A00(A00, r04, 64);
            MailboxFeature A0d = 7zP.A0d(r04.A00);
            Long valueOf = Long.valueOf(longValue);
            1Um A0O = 1BK.A0O(A0d, 2);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            1Um.A02(A0O, new IbT(0, 100, l2, valueOf, A0d, A0P, 0), A0P, false);
            A0P.addResultCallback(A002);
        }
        1Br.A0D(this.A08, AC8.A00(this, 41), A00);
    }

    public final void A02(Function1 function1) {
        MutableLiveData mutableLiveData = this.A04;
        List list = (List) mutableLiveData.getValue();
        if (list == null) {
            list = C0ty.A00;
        }
        ArrayList A1E = C1A3.A1E(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(((MediaItem) it.next()).A07);
        }
        List list2 = (List) mutableLiveData.getValue();
        if (list2 == null) {
            list2 = C0ty.A00;
        }
        ArrayList A1E2 = C1A3.A1E(list2);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            4YU.A1W(A1E2, ((MediaItem) it2.next()).A04);
        }
        9mQ r0 = (9mQ) 1Br.A0B(this.A07);
        1FV A0j = 4YU.A0j();
        ArrayList A1E3 = C1A3.A1E(A1E);
        Iterator it3 = A1E.iterator();
        while (it3.hasNext()) {
            String path = Uri.parse(AnonymousClass001.A0i(it3)).getPath();
            if (path == null) {
                throw 1BK.A0h();
            }
            A1E3.add(path);
        }
        A1e A00 = A1e.A00(r0, A1E3, A0j, 42);
        C2cx c2cx = (C2cx) 1Br.A0B(r0.A00);
        1Um A0R = 1BL.A0R(c2cx);
        MailboxFutureImpl A0P = 1BK.A0P(A0R);
        1Um.A00(A0R, new A1e(c2cx, A0P, A1E2, 1), A0P);
        A0P.addResultCallback(A00);
        1Br.A0D(this.A08, new ABt(11, function1, A1E, this), A0j);
    }
}
