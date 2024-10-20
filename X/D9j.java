package X;

import androidx.lifecycle.MutableLiveData;
import com.facebook.messaging.communitymessaging.communitynickname.SetCommunityNicknameDialogFragment;

/* loaded from: D9j.class */
public final class D9j implements Runnable {
    public static final String __redex_internal_original_name = "SetCommunityNicknameDialogFragment$fetchNickname$1$onChanged$1";
    public final /* synthetic */ MutableLiveData A00;
    public final /* synthetic */ SetCommunityNicknameDialogFragment A01;
    public final /* synthetic */ CZz A02;
    public final /* synthetic */ String A03;

    public D9j(MutableLiveData mutableLiveData, SetCommunityNicknameDialogFragment setCommunityNicknameDialogFragment, CZz cZz, String str) {
        this.A01 = setCommunityNicknameDialogFragment;
        this.A03 = str;
        this.A00 = mutableLiveData;
        this.A02 = cZz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SetCommunityNicknameDialogFragment setCommunityNicknameDialogFragment = this.A01;
        String str = this.A03;
        setCommunityNicknameDialogFragment.A04 = str;
        String str2 = setCommunityNicknameDialogFragment.A05;
        if (str2 == null || str2.length() == 0) {
            SetCommunityNicknameDialogFragment.A06(setCommunityNicknameDialogFragment, str);
        }
        ((C4Y) 1Br.A0B(setCommunityNicknameDialogFragment.A07)).A00(setCommunityNicknameDialogFragment.A04, setCommunityNicknameDialogFragment.A05, 1, 1);
        this.A00.removeObserver(this.A02);
    }
}
