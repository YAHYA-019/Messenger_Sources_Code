package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.rollcall.extension.CreatePromptExtensionParams;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.UserKey;

/* renamed from: X.Alw, reason: case insensitive filesystem */
/* loaded from: Alw.class */
public final class C1577Alw extends 1pK implements AaW, DF3 {
    public static final int A03 = View.generateViewId();
    public static final String __redex_internal_original_name = "CreatePromptExtensionFragment";
    public 6Je A00;
    public CreatePromptExtensionParams A01;
    public ThreadKey A02;

    public void BiL() {
    }

    public void BiM() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        return this.mFragmentManager.A1V();
    }

    public void BlA() {
    }

    public void CSS() {
        Bkd();
    }

    @Override // X.DF3
    public void CmU(6Je r302) {
        11T.A0F(r302, 0);
        this.A00 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(634104598);
        FrameLayout A08 = AbJ.A08(this);
        A08.setId(A03);
        0FI.A08(380384657, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        CreatePromptExtensionParams createPromptExtensionParams;
        Parcelable.Creator creator;
        11T.A0F(view, 0);
        Bundle bundle2 = this.mArguments;
        ThreadKey threadKey = null;
        if (bundle2 != null) {
            Object obj = CreatePromptExtensionParams.class.getDeclaredField("CREATOR").get(null);
            if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
                throw 7zS.A0v(CreatePromptExtensionParams.class);
            }
            createPromptExtensionParams = (CreatePromptExtensionParams) 7zQ.A0K(bundle2, creator, CreatePromptExtensionParams.class, "arg_prompt_extension_param");
        } else {
            createPromptExtensionParams = null;
        }
        this.A01 = createPromptExtensionParams;
        if (createPromptExtensionParams != null) {
            threadKey = createPromptExtensionParams.A01;
        }
        this.A02 = threadKey;
        super.onViewCreated(view, bundle);
        CreatePromptExtensionParams createPromptExtensionParams2 = this.A01;
        11T.A0I(createPromptExtensionParams2, "null cannot be cast to non-null type com.facebook.messaging.rollcall.extension.CreatePromptExtensionParams");
        ThreadKey threadKey2 = createPromptExtensionParams2.A01;
        if (threadKey2 != null) {
            Integer num = createPromptExtensionParams2.A05;
            String str = createPromptExtensionParams2.A06;
            MediaResource mediaResource = createPromptExtensionParams2.A03;
            UserKey userKey = createPromptExtensionParams2.A04;
            Message message = createPromptExtensionParams2.A00;
            BMJ bmj = createPromptExtensionParams2.A02;
            Bundle A05 = 1BK.A05();
            String str2 = null;
            A05.putString(7zK.A00(258), num != null ? 1 - num.intValue() != 0 ? "text" : "media" : null);
            A05.putString(7zK.A00(260), str);
            A05.putString(7zK.A00(254), String.valueOf(userKey));
            A05.putParcelable(7zK.A00(257), 0Gm.A00(mediaResource));
            A05.putParcelable("arg_thread_key", new OpaqueParcelable(threadKey2));
            A05.putParcelable(7zK.A00(83), 0Gm.A00(message));
            if (bmj != null) {
                str2 = bmj.parentSurfaceString;
            }
            A05.putString("arg_parent_surface", str2);
            Fragment fragment = new 8Ga();
            fragment.setArguments(A05);
            C06c A09 = AbJ.A09(this);
            A09.A0Q(fragment, "create_prompt", A03);
            A09.A0V(null);
            C06c.A00(A09, false);
        }
        ThreadKey threadKey3 = this.A02;
        if (threadKey3 != null) {
            1UG A08 = 1BK.A08(4YV.A0B(), 4YT.A00(68));
            if (A08.isSampled()) {
                0DA r0 = new 0DA();
                r0.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 1BK.A0w(threadKey3));
                r0.A07("key", threadKey3.toString());
                r0.A01(EnumC03583yg.A08, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                A08.A5c(7NO.A05, "feature");
                AbF.A1K(r0, A08);
                4YU.A1I(A08, "stage", 14);
                A08.BZL();
            }
        }
        AbH.A07(this).A1O(new CZm(this, 13), getViewLifecycleOwner(), 7zK.A00(406));
    }
}
