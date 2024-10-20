package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.forked.model.viewer.PollVoteResults;
import com.facebook.messaging.montage.forked.model.viewer.ViewerPollVoteInfo;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.resources.ui.FbFrameLayout;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: Ind.class */
public final class Ind implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public Ind(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = obj;
        this.A03 = obj4;
        this.A05 = str;
        this.A02 = obj2;
    }

    private void A00(Throwable th) {
        boolean A1U = AnonymousClass001.A1U(th);
        IFW ifw = (IFW) this.A01;
        int[] iArr = IFW.A0U;
        if (ifw.A06 != null) {
            if (!A1U) {
                th.getMessage();
            }
            I2m i2m = (I2m) this.A04;
            i2m.A08.get(this.A05).getClass();
        }
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                Hze hze = (Hze) this.A04;
                FbUserSession fbUserSession = (FbUserSession) this.A01;
                BaseItem baseItem = (BaseItem) this.A03;
                11T.A0D(baseItem);
                EffectItem effectItem = (EffectItem) baseItem;
                String str = this.A05;
                ((C2778Gnv) 4YU.A0n(fbUserSession, hze.A00, 115493)).A06(null, new IW4(fbUserSession, (Hfy) this.A02, hze, str), effectItem, false);
                return;
            case 1:
                I2m i2m = (I2m) this.A04;
                String str2 = this.A05;
                java.util.Map map = i2m.A08;
                Preconditions.checkArgument(map.containsKey(str2));
                map.get(str2).getClass();
                ViewerPollVoteInfo viewerPollVoteInfo = (ViewerPollVoteInfo) DKC.A12(str2, map);
                viewerPollVoteInfo.getClass();
                long j = viewerPollVoteInfo.A02;
                String str3 = viewerPollVoteInfo.A03;
                map.put(str2, new ViewerPollVoteInfo(((ViewerPollVoteInfo) map.get(str2)).A00 + 1, viewerPollVoteInfo.A01, str3, j));
                I2m.A00(i2m);
                int[] iArr = IFW.A0U;
                0fH.A0r("PollStickerOverlayExperimentalController", "Error while voting on a poll", th);
                A00(th);
                return;
            case 2:
                if (th != null) {
                    th.getMessage();
                    return;
                }
                return;
            default:
                11T.A0F(th, 0);
                if (!(th instanceof CancellationException)) {
                    1Br.A04(((Hpd) this.A04).A02).softReport("SubtitlesRequestAPI.Error", 0Pz.A0W("Encountered an error during Subtitles GraphQL Fetch for video: ", this.A05), th);
                }
                4YV.A11(((Hpd) this.A04).A04).execute(new Iz8((C6dl) this.A01, th));
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        Executor A11;
        Iz7 iuV;
        2JY r0;
        2JY A0B;
        ImmutableList A0c;
        switch (this.A00) {
            case 0:
                Boolean bool = (Boolean) obj;
                Hze hze = (Hze) this.A04;
                FbUserSession fbUserSession = (FbUserSession) this.A01;
                BaseItem baseItem = (BaseItem) this.A03;
                11T.A0D(baseItem);
                EffectItem effectItem = (EffectItem) baseItem;
                String str = this.A05;
                Hfy hfy = (Hfy) this.A02;
                if (bool == null) {
                    throw 1BK.A0h();
                }
                if (bool.booleanValue()) {
                    Hze.A00(fbUserSession, hfy, hze, effectItem, str);
                    return;
                } else {
                    ((C2778Gnv) 4YU.A0n(fbUserSession, hze.A00, 115493)).A06(null, new IW4(fbUserSession, hfy, hze, str), effectItem, false);
                    return;
                }
            case 1:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null) {
                    A00(null);
                    return;
                }
                2JY r02 = (2JY) obj2;
                2JY A0B2 = 1BK.A0B(r02, 2JX.class, 309451119, 2068656848);
                if (A0B2 == null || A0B2.A0L(-2034744124, 2JX.class, -167706386) == null) {
                    A00(AbF.A1D("Null story card poll recieved on mutation"));
                }
                IFW ifw = (IFW) this.A01;
                String str2 = this.A05;
                IXN ixn = (GL2) this.A03;
                FbUserSession fbUserSession2 = (FbUserSession) this.A02;
                int[] iArr = IFW.A0U;
                I2m A0X = GOq.A0X(fbUserSession2, ifw);
                java.util.Map map = A0X.A08;
                Preconditions.checkArgument(map.containsKey(str2));
                map.get(str2).getClass();
                ViewerPollVoteInfo viewerPollVoteInfo = (ViewerPollVoteInfo) DKC.A12(str2, map);
                viewerPollVoteInfo.getClass();
                map.put(str2, new ViewerPollVoteInfo(((ViewerPollVoteInfo) map.get(str2)).A00 + 1, viewerPollVoteInfo.A01, viewerPollVoteInfo.A03, viewerPollVoteInfo.A02));
                I2m.A00(A0X);
                PollVoteResults pollVoteResults = (PollVoteResults) A0X.A07.get(str2);
                if (pollVoteResults == null) {
                    pollVoteResults = new PollVoteResults(ImmutableList.of(), "", 0L);
                }
                long j = pollVoteResults.A00;
                2JX A0L = 1BL.A0L(1BK.A0B(r02, 2JX.class, 309451119, 2068656848), -2034744124, -167706386);
                A0X.A01(I6C.A01(A0L, A0L.getIntValue(1760627594), true), str2, j);
                if (ifw.A08.A01.A0E.equals(ixn.A01.A0E)) {
                    ifw.A0A();
                }
                Hir hir = ifw.A06;
                if (hir != null) {
                    ((I2m) this.A04).A08.get(str2).getClass();
                    2JX A0u = hir.A00.A0u();
                    IFW ifw2 = hir.A02;
                    if (ifw2.A0C(hir.A03) && A0u != null && A0u.getBooleanValue(-1749366516)) {
                        FbFrameLayout fbFrameLayout = hir.A06;
                        if (ifw2.A04 != null) {
                            fbFrameLayout.findViewById(2131364066);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((ElR) this.A04).A02.put(this.A05, this.A02);
                return;
            default:
                AbstractC08294mh abstractC08294mh2 = (AbstractC08294mh) obj;
                if (((C03713yu) this.A02).isCancelled()) {
                    return;
                }
                if (abstractC08294mh2 != null && (r0 = (2JY) abstractC08294mh2.A03) != null && (A0B = 1BK.A0B(r0, 2JX.class, 112202875, -1678251692)) != null && (A0c = A0B.A0c(-1646749039, 2JX.class, -411127124)) != null) {
                    if (A0c.size() != 0) {
                        Hpd hpd = (Hpd) this.A04;
                        String str3 = this.A05;
                        C6dl c6dl = (C6dl) this.A01;
                        2JY r03 = (2JY) 4YU.A0q(A0c, 0);
                        ImmutableList A0c2 = r03.A0c(-289189021, 2JX.class, 1737571402);
                        11T.A0A(A0c2);
                        int size = A0c2.size();
                        ArrayList A0s = AnonymousClass001.A0s();
                        for (int i = 0; i < size; i++) {
                            2JY A0M = AbF.A0M(A0c2, i);
                            int intValue = A0M.getIntValue(-1573145462);
                            int intValue2 = A0M.getIntValue(1725551537);
                            String A0r = A0M.A0r(-1076648986);
                            if (A0r == null) {
                                A0r = "";
                            }
                            try {
                                A0s.add(new S6I(intValue, intValue2, A0r));
                            } catch (RuntimeException e) {
                                1Br.A04(hpd.A02).softReport("SubtitlesRequestAPI.addEntryError", 0Pz.A0W("Encountered an error while adding entry for video: ", str3), e);
                                4YV.A11(hpd.A04).execute(new IuV(c6dl));
                                return;
                            }
                        }
                        r03.A0r(3355);
                        Hgo hgo = new Hgo(str3, r03.A0r(-1067157689), (S6I[]) A0s.toArray(new S6I[0]), false);
                        A11 = 4YV.A11(hpd.A04);
                        iuV = new Iz7(hgo, c6dl);
                        A11.execute(iuV);
                        return;
                    }
                }
                Hpd hpd2 = (Hpd) this.A04;
                1Br.A04(hpd2.A02).D0v("VideoSubtitles", "Invalid results on fetching subtitles GraphQL.");
                C6dl c6dl2 = (C6dl) this.A01;
                A11 = 4YV.A11(hpd2.A04);
                iuV = new IuV(c6dl2);
                A11.execute(iuV);
                return;
        }
    }
}
