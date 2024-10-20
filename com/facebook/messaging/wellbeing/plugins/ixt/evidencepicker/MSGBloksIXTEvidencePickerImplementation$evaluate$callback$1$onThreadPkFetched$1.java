package com.facebook.messaging.wellbeing.plugins.ixt.evidencepicker;

import X.04S;
import X.0CL;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Dt;
import X.0Q8;
import X.11T;
import X.1BL;
import X.6Im;
import X.6In;
import X.7zT;
import X.AnonymousClass001;
import X.Ca8;
import X.DDz;
import X.FHh;
import X.FjZ;
import X.GJj;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function2;

/* loaded from: MSGBloksIXTEvidencePickerImplementation$evaluate$callback$1$onThreadPkFetched$1.class */
public final class MSGBloksIXTEvidencePickerImplementation$evaluate$callback$1$onThreadPkFetched$1 extends 0DO implements Function2 {
    public final /* synthetic */ DDz $bloksScreenNavigationCallback;
    public final /* synthetic */ FHh $environment;
    public final /* synthetic */ String $evidenceType;
    public final /* synthetic */ 0CL $fragment;
    public final /* synthetic */ 6In $frxFragmentLauncher;
    public final /* synthetic */ String $headerSubtitle;
    public final /* synthetic */ String $headerTitle;
    public final /* synthetic */ String $navBarTitle;
    public final /* synthetic */ GJj $successCallback;
    public final /* synthetic */ ThreadKey $threadKey;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MSGBloksIXTEvidencePickerImplementation$evaluate$callback$1$onThreadPkFetched$1(DDz dDz, 6In r303, ThreadKey threadKey, FHh fHh, GJj gJj, String str, String str2, String str3, String str4, 0DR r311, 0CL r312) {
        super(2, r311);
        this.$frxFragmentLauncher = r303;
        this.$fragment = r312;
        this.$navBarTitle = str;
        this.$headerTitle = str2;
        this.$headerSubtitle = str3;
        this.$evidenceType = str4;
        this.$threadKey = threadKey;
        this.$bloksScreenNavigationCallback = dDz;
        this.$successCallback = gJj;
        this.$environment = fHh;
    }

    public final 0DR create(Object obj, 0DR r303) {
        6In r0 = this.$frxFragmentLauncher;
        0CL r02 = this.$fragment;
        String str = this.$navBarTitle;
        String str2 = this.$headerTitle;
        String str3 = this.$headerSubtitle;
        String str4 = this.$evidenceType;
        ThreadKey threadKey = this.$threadKey;
        return new MSGBloksIXTEvidencePickerImplementation$evaluate$callback$1$onThreadPkFetched$1(this.$bloksScreenNavigationCallback, r0, threadKey, this.$environment, this.$successCallback, str, str2, str3, str4, r303, r02);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        6Im r0 = this.$frxFragmentLauncher;
        Object obj2 = this.$fragment.element;
        if (obj2 == null) {
            11T.A0L("fragment");
            throw 0Q8.createAndThrow();
        }
        Fragment fragment = (Fragment) obj2;
        String str = this.$navBarTitle;
        String str2 = this.$headerTitle;
        String str3 = this.$headerSubtitle;
        String str4 = this.$evidenceType;
        ThreadKey threadKey = this.$threadKey;
        DDz dDz = this.$bloksScreenNavigationCallback;
        FjZ fjZ = new FjZ(this.$environment, this.$successCallback);
        6Im r02 = r0;
        11T.A0F(fragment, 0);
        7zT.A1W(str, str2, str3, str4);
        1BL.A1G(threadKey, dDz);
        LiveData A07 = 7zT.A07(threadKey);
        A07.observe(fragment.getViewLifecycleOwner(), new Ca8(fragment, A07, dDz, fjZ, r02, threadKey, str4, str2, str3));
        return 04S.A00;
    }
}
