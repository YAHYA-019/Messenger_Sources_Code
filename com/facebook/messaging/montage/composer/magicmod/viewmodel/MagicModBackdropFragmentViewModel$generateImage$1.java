package com.facebook.messaging.montage.composer.magicmod.viewmodel;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Br;
import X.2Jd;
import X.2Zs;
import X.2aK;
import X.7zN;
import X.8D1;
import X.8N5;
import X.AIb;
import X.AJi;
import X.AnonymousClass001;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.messaging.montage.composer.magicmod.service.MagicModGenerateImageService;
import kotlin.jvm.functions.Function2;

/* loaded from: MagicModBackdropFragmentViewModel$generateImage$1.class */
public final class MagicModBackdropFragmentViewModel$generateImage$1 extends 0DO implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $maskFileHandle;
    public final /* synthetic */ String $originalFileHandle;
    public final /* synthetic */ String $prompt;
    public int label;
    public final /* synthetic */ 8D1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicModBackdropFragmentViewModel$generateImage$1(Context context, 8D1 r303, String str, String str2, String str3, 0DR r307) {
        super(2, r307);
        this.this$0 = r303;
        this.$context = context;
        this.$prompt = str;
        this.$originalFileHandle = str2;
        this.$maskFileHandle = str3;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new MagicModBackdropFragmentViewModel$generateImage$1(this.$context, this.this$0, this.$prompt, this.$originalFileHandle, this.$maskFileHandle, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            MagicModGenerateImageService magicModGenerateImageService = (MagicModGenerateImageService) 1Br.A0B(this.this$0.A03);
            Context context = this.$context;
            FbUserSession fbUserSession = this.this$0.A00;
            String str = this.$prompt;
            String str2 = this.$originalFileHandle;
            String str3 = this.$maskFileHandle;
            11T.A0F(str, 1);
            1BK.A1J(str2, 2, str3);
            Integer num = 0S2.A01;
            this.label = 1;
            if (AIb.A02(11, this)) {
                throw AnonymousClass001.A0Q("i3");
            }
            AIb aIb = new AIb(magicModGenerateImageService, this, 11);
            obj = aIb.A02;
            int i2 = aIb.A00;
            if (i2 == 0) {
                0Dt.A00(obj);
                MagicModGenerateImageService.A02(magicModGenerateImageService, num);
                aIb.A01 = magicModGenerateImageService;
                aIb.A00 = 2;
                GraphQlCallInput graphQlCallInput = new 2Jd(ActionId.RTMP_PACKET_RECEIVED);
                graphQlCallInput.A09("src_opaque_token_handle", str2);
                graphQlCallInput.A09("mask_opaque_token_handle", str3);
                2Jd r02 = new 2Jd(ActionId.QUERY_READY);
                r02.A09("prompt", str);
                r02.A05(graphQlCallInput, "src_image");
                r02.A09("surface", "MESSENGER");
                11T.A0F(num, 0);
                r02.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "BACKDROP");
                obj = MagicModGenerateImageService.A00(context, fbUserSession, r02, magicModGenerateImageService, str, aIb);
                if (obj == r0) {
                    return r0;
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw AnonymousClass001.A0M();
                }
                magicModGenerateImageService = (MagicModGenerateImageService) aIb.A01;
                0Dt.A00(obj);
            }
            MagicModGenerateImageService.A03(magicModGenerateImageService, obj instanceof 8N5);
            if (obj == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj);
                return 04S.A00;
            }
            0Dt.A00(obj);
        }
        2Zs A0x = 7zN.A0x();
        AJi A03 = AJi.A03(obj, this.this$0, null, 42);
        this.label = 2;
        if (2aK.A00(this, A0x, A03) == r0) {
            return r0;
        }
        return 04S.A00;
    }
}
