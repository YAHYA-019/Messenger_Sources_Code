package X;

import android.content.Context;
import android.util.Base64;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.audio.transcriptions.model.MessageTranscription;
import com.facebook.messaging.media.send.MediaMessageFactory;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.share.SentShareAttachment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.share.model.ComposerAppAttribution;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: D35.class */
public final class D35 implements Function {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ 5Pz A03;
    public final /* synthetic */ MediaMessageFactory A04;
    public final /* synthetic */ ThreadKey A05;
    public final /* synthetic */ ThreadSummary A06;
    public final /* synthetic */ ComposerAppAttribution A07;
    public final /* synthetic */ Capabilities A08;
    public final /* synthetic */ ImmutableMap A09;
    public final /* synthetic */ ImmutableMap A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public D35(Context context, FbUserSession fbUserSession, 5Pz r304, MediaMessageFactory mediaMessageFactory, ThreadKey threadKey, ThreadSummary threadSummary, ComposerAppAttribution composerAppAttribution, Capabilities capabilities, ImmutableMap immutableMap, ImmutableMap immutableMap2, String str, String str2, int i) {
        this.A04 = mediaMessageFactory;
        this.A05 = threadKey;
        this.A08 = capabilities;
        this.A02 = fbUserSession;
        this.A03 = r304;
        this.A09 = immutableMap;
        this.A0A = immutableMap2;
        this.A01 = context;
        this.A0B = str;
        this.A07 = composerAppAttribution;
        this.A00 = i;
        this.A06 = threadSummary;
        this.A0C = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v411, types: [java.util.List] */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        ArrayList<List> A0s;
        C5es c5es;
        5HP r311;
        List list = (List) obj;
        ArrayList A0s2 = AnonymousClass001.A0s();
        MediaMessageFactory mediaMessageFactory = this.A04;
        if (list == null) {
            throw 1BK.A0e();
        }
        ThreadKey threadKey = this.A05;
        if (4YU.A1Y(this.A08, 40)) {
            A0s = 1JW.A06(1BK.A17(list), 1);
        } else {
            A0s = AnonymousClass001.A0s();
            ArrayList A0s3 = AnonymousClass001.A0s();
            for (Object obj2 : list) {
                if (((MediaResource) obj2).A0Q == 5HP.A0F) {
                    A0s3.add(obj2);
                }
            }
            ArrayList A0s4 = AnonymousClass001.A0s();
            for (Object obj3 : list) {
                if (((MediaResource) obj3).A0Q != 5HP.A0F) {
                    A0s4.add(obj3);
                }
            }
            A0s.addAll(1JW.A06(A0s4, 1));
            if (1BK.A1Y(A0s3)) {
                C00i A0R = AbF.A0R(mediaMessageFactory.A0C);
                int size = A0s3.size();
                if (!ThreadKey.A0q(threadKey)) {
                    A0R.get();
                }
                A0R.get();
                RoundingMode roundingMode = RoundingMode.CEILING;
                A0s.addAll(1JW.A06(A0s3, 1PP.A02(roundingMode, size, 1PP.A02(roundingMode, size, 30))));
            }
        }
        FbUserSession fbUserSession = this.A02;
        5Pz r0 = this.A03;
        ImmutableMap immutableMap = this.A09;
        ImmutableMap immutableMap2 = this.A0A;
        Context context = this.A01;
        String str = this.A0B;
        ComposerAppAttribution composerAppAttribution = this.A07;
        int i = this.A00;
        ThreadSummary threadSummary = this.A06;
        String str2 = this.A0C;
        for (List<MediaResource> list2 : A0s) {
            String valueOf = str2 == null ? String.valueOf(((53F) 1Br.A0B(mediaMessageFactory.A0D)).A01()) : str2;
            ArrayList A11 = C0s8.A11(7zP.A0g(5Pp.A00(threadKey)));
            if (1BK.A1Y(list2)) {
                4YU.A1W(A11, MediaMessageFactory.A00(4YU.A0a(list2, 0)));
                4YU.A1W(A11, list2.size());
            }
            if (AnonymousClass001.A1V(1De.A00(mediaMessageFactory.A00, 33058))) {
                4YU.A1W(A11, 151L);
            }
            C00i c00i = mediaMessageFactory.A02.A00;
            if (((1PG) c00i.get()).A05()) {
                4YU.A1W(A11, 150L);
            }
            C00i c00i2 = mediaMessageFactory.A0E.A00;
            String A02 = ((5Et) c00i2.get()).A02(valueOf, A11, 4);
            if (A02 == null) {
                A02 = null;
            } else {
                ((5Et) c00i2.get()).A05(A02, 5Pq.A01(context, 0S2.A00), 4, 2222);
                1Ql A08 = 1Br.A08(mediaMessageFactory.A04);
                A08.CaL(new 1G3(valueOf), A02);
                A08.commit();
                if (threadKey != null && (threadKey.A1F() || threadKey.A1I())) {
                    ((5Et) c00i2.get()).A05(A02, (List) null, 4, 63);
                }
                if (!((1PG) c00i.get()).A05()) {
                    ArrayList A0s5 = AnonymousClass001.A0s();
                    4YU.A1W(A0s5, list2.size());
                    if (1BK.A1Y(list2)) {
                        4YU.A1W(A0s5, MediaMessageFactory.A00(4YU.A0a(list2, 0)));
                    }
                    if (threadSummary != null) {
                        4YU.A1W(A0s5, AbF.A00(threadSummary));
                    }
                    ((5Et) c00i2.get()).A05(A02, A0s5, 4, 53);
                }
            }
            ArrayList A0z = 1BL.A0z(list2);
            for (MediaResource mediaResource : list2) {
                C5en A0p = AbI.A0p(mediaResource);
                A0p.A0J = threadKey;
                if (str != null && mediaResource.A0r == null) {
                    A0p.A0p = str;
                }
                if (ThreadKey.A0q(threadKey)) {
                    5HP r02 = A0p.A0P;
                    if (r02 != null) {
                        C7l6 c7l6 = C7l6.$redex_init_class;
                        int ordinal = r02.ordinal();
                        if (ordinal == 1) {
                            r311 = 5HP.A06;
                        } else if (ordinal == 2) {
                            r311 = 5HP.A04;
                        }
                        A0p.A0P = r311;
                        BhR bhR = (BhR) 1Br.A0B(mediaMessageFactory.A01);
                        byte[] bArr = new byte[32];
                        bhR.A00.nextBytes(bArr);
                        A0p.A0j = Base64.encodeToString(bArr, 0);
                    }
                    r311 = 5HP.A05;
                    A0p.A0P = r311;
                    BhR bhR2 = (BhR) 1Br.A0B(mediaMessageFactory.A01);
                    byte[] bArr2 = new byte[32];
                    bhR2.A00.nextBytes(bArr2);
                    A0p.A0j = Base64.encodeToString(bArr2, 0);
                }
                if (mediaResource.A0Q != 5HP.A03) {
                    0OO r03 = mediaResource.A0F;
                    0OO r308 = 0OO.A09;
                    if (r03 == r308) {
                        ImmutableBiMap immutableBiMap = 0OP.A00;
                        if (i == 1) {
                            r308 = 0OO.A03;
                        } else if (i == 2) {
                            r308 = 0OO.A01;
                        }
                        A0p.A0F = r308;
                    }
                }
                MediaResourceSendSource mediaResourceSendSource = mediaResource.A0W;
                MediaResourceSendSource mediaResourceSendSource2 = MediaResourceSendSource.A03;
                if (mediaResourceSendSource == mediaResourceSendSource2) {
                    C7l6 c7l62 = C7l6.$redex_init_class;
                    int ordinal2 = r0.ordinal();
                    if (ordinal2 == 11) {
                        c5es = C5es.A04;
                    } else if (ordinal2 != 24) {
                        if (ordinal2 == 26) {
                            c5es = C5es.A0K;
                        }
                        A0p.A0V = mediaResourceSendSource2;
                    } else {
                        c5es = C5es.A0A;
                    }
                    mediaResourceSendSource2 = new MediaResourceSendSource(c5es, C5et.PICK);
                    A0p.A0V = mediaResourceSendSource2;
                }
                A0p.A0s = valueOf;
                A0z.add(4YU.A0Y(A0p));
            }
            long j = threadSummary != null ? threadSummary.A06 : 0L;
            ArrayList A0s6 = AnonymousClass001.A0s();
            Iterator it = A0z.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MediaResource A0Z = 4YU.A0Z(it);
                ((C6fm) 1Br.A0B(mediaMessageFactory.A0A)).A00(threadKey).D2L(A0Z, A0z.size() == 1);
                MessageTranscription messageTranscription = A0Z.A0G;
                if (messageTranscription != null) {
                    A0s6.add(messageTranscription);
                }
            }
            5PI A0d = AbF.A0d(((CQl) 1Br.A0B(mediaMessageFactory.A0F)).A0F(fbUserSession, (SentShareAttachment) null, threadKey, composerAppAttribution, ImmutableList.of(), valueOf, "", ImmutableList.of(), A0z, RegularImmutableMap.A03, j));
            if (7zM.A1b(A0s6)) {
                A0d.A0B(0DW.A00(A0s6));
            }
            Message A0U = 4YU.A0U(A0d);
            5PI A0d2 = AbF.A0d(A0U);
            ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
            builder.putAll(A0U.A13);
            builder.putAll(immutableMap);
            A0d2.A0K(builder.build());
            ImmutableMap.Builder builder2 = new ImmutableMap.Builder(4);
            builder2.putAll(A0U.A14);
            builder2.putAll(immutableMap2);
            A0d2.A0L(builder2.build());
            A0d2.A1h = A02;
            A0s2.add(4YU.A0U(A0d2));
        }
        return 0DW.A00(A0s2);
    }
}
