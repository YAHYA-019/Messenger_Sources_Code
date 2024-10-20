package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.generatedstickers.search.GeneratedStickerSearchFragment;
import com.facebook.stickers.keyboardls.stickergrid.StickerGridView;
import com.facebook.stickers.model.Sticker;
import java.util.EnumMap;
import java.util.Set;

/* loaded from: Igg.class */
public final class Igg implements JMq {
    public final /* synthetic */ GeneratedStickerSearchFragment A00;

    public Igg(GeneratedStickerSearchFragment generatedStickerSearchFragment) {
        this.A00 = generatedStickerSearchFragment;
    }

    @Override // X.JMq
    public void BZm() {
    }

    @Override // X.JMq
    public void BdD() {
    }

    @Override // X.JMq
    public void CNH(Sticker sticker, int i) {
    }

    @Override // X.JMq
    public void CNO(Sticker sticker, C5es c5es, String str, int i, boolean z) {
        GeneratedStickerSearchFragment generatedStickerSearchFragment = this.A00;
        ID8 id8 = (ID8) 1Br.A0B(generatedStickerSearchFragment.A0R);
        ThreadKey threadKey = generatedStickerSearchFragment.A04;
        long j = i;
        String A1C = generatedStickerSearchFragment.A1C();
        Boolean valueOf = Boolean.valueOf(generatedStickerSearchFragment.A0K);
        String str2 = sticker.A0F;
        Set set = id8.A03;
        if (set.contains(str2)) {
            return;
        }
        set.add(str2);
        1UG A08 = 1BK.A08(1Br.A02(id8.A00), 4YT.A00(39));
        if (A08.isSampled()) {
            ID8.A03(A08, id8, j);
            A08.A7R("search_query", A1C);
            A08.A7R("item_collection_id", sticker.A0H);
            A08.A7R("item_id", str2);
            A08.A5c(HCd.A05, "sticker_type");
            AbstractC2327GOs.A0o(A08, valueOf, ID8.A00(threadKey, id8));
            A08.BZL();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.stickers.generatedstickers.search.GeneratedStickerSearchFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    @Override // X.JMq
    public void CNQ(Sticker sticker, String str, int i) {
        ?? r0 = this.A00;
        ID8 id8 = (ID8) 1Br.A0B(r0.A0R);
        ThreadKey threadKey = r0.A04;
        long j = i;
        String A00 = ((Ho2) 1Br.A0B(r0.A0P)).A00(sticker);
        Boolean valueOf = Boolean.valueOf(r0.A0K);
        Boolean valueOf2 = Boolean.valueOf(6Bl.A03(sticker));
        1UG A08 = 1BK.A08(1Br.A02(id8.A00), 1BJ.A00(487));
        if (A08.isSampled()) {
            ID8.A03(A08, id8, j);
            AbstractC2327GOs.A0o(A08, valueOf, ID8.A00(threadKey, id8));
            A08.A7R("search_query", str);
            A08.A7R("item_id", sticker.A0F);
            ID8.A02(A08, threadKey, sticker, A00);
            A08.A5H("is_animated", valueOf2);
            A08.BZL();
        }
        C6qm c6qm = (C6qm) 1Br.A0B(r0.A0O);
        ThreadKey threadKey2 = r0.A04;
        C6wd A002 = c6qm.A00(null, null, threadKey2 != null ? threadKey2.A0z() : false);
        EnumMap enumMap = new EnumMap(C6we.class);
        if (str != null && str.length() != 0) {
            enumMap.put((EnumMap) C6we.A02, (C6we) new Im4(r0, str, 0));
            enumMap.put((EnumMap) C6we.A04, (C6we) new Im4(r0, str, 1));
        }
        Context requireContext = r0.requireContext();
        StickerGridView stickerGridView = r0.A0B;
        if (stickerGridView == null) {
            throw 1BK.A0h();
        }
        2qR r02 = 6tM.A01;
        A002.A03(requireContext, stickerGridView, null, r0.getParentFragmentManager(), sticker, 6zN.A00(7zQ.A0m(r0.A0N)), 96D.A04, enumMap, new J8r(r0, sticker, str, i, 1));
    }

    @Override // X.JMq
    public void CNW(Sticker sticker, C5es c5es, Boolean bool, String str, String str2, int i) {
        0D2 r0 = this.A00;
        ID8 id8 = (ID8) 1Br.A0B(r0.A0R);
        ThreadKey threadKey = r0.A04;
        String str3 = sticker.A0F;
        String str4 = sticker.A0H;
        long j = i;
        String A1C = r0.A1C();
        String A00 = ((Ho2) 1Br.A0B(r0.A0P)).A00(sticker);
        Boolean valueOf = Boolean.valueOf(r0.A0K);
        11T.A0G(str3, 1, str4);
        1UG A08 = 1BK.A08(1Br.A02(id8.A00), 7zK.A00(8));
        if (A08.isSampled()) {
            GOn.A1Q(A08, id8.A02);
            A08.A5c(C98O.A01, "send_source");
            A08.A7R("item_id", str3);
            A08.A7R("item_collection_id", str4);
            A08.A6H("absolute_position", Long.valueOf(j));
            A08.A5c(C7ks.A00(threadKey, true), "thread_type");
            A08.A7R("format", ID8.A01(A00));
            A08.A5c(HCd.A05, "sticker_type");
            A08.A7R("search_query", A1C);
            A08.A6H("thread_id", Long.valueOf(ID8.A00(threadKey, id8)));
            A08.A09("is_download");
            A08.A5H("is_try_again_sticker", valueOf);
            A08.BZL();
        }
        I5H i5h = (I5H) 1Br.A0B(r0.A0Q);
        FbUserSession fbUserSession = r0.A01;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        i5h.A04(fbUserSession, str3);
        06Z parentFragmentManager = r0.getParentFragmentManager();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("sent_sticker", sticker);
        A05.putInt("sent_sticker_position", i);
        A05.putString("sent_sticker_query", r0.A1C());
        A05.putBoolean("sent_sticker_by_try_again", r0.A0K);
        parentFragmentManager.A1R("generated_sticker_search_result", A05);
        r0.A0o();
    }

    @Override // X.JMq
    public void Cbt() {
    }

    @Override // X.JMq
    public void CcJ(EditText editText, JEs jEs) {
    }

    @Override // X.JMq
    public void D87(int i) {
    }
}
