package com.facebook.messaging.encryptedbackups.setting.fragment;

import X.04S;
import X.0Be;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.0Q8;
import X.11T;
import X.4YV;
import X.99Z;
import X.9lL;
import X.AKJ;
import X.AQo;
import X.AnonymousClass001;
import X.C8tg;
import X.C8th;
import X.C8vA;
import android.widget.Toast;
import com.encryptedbackups.statemanager.model.DeleteBackupException;
import com.encryptedbackups.statemanager.model.RemoveAllDevicesFromBackupException;
import com.encryptedbackups.statemanager.model.RemoveVirtualDeviceException;

/* loaded from: EncryptedBackupsSettingFragment$onViewCreated$1$1$1.class */
public final class EncryptedBackupsSettingFragment$onViewCreated$1$1$1 extends 0DO implements 0Be {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C8vA this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptedBackupsSettingFragment$onViewCreated$1$1$1(C8vA c8vA, 0DR r303) {
        super(4, r303);
        this.this$0 = c8vA;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        EncryptedBackupsSettingFragment$onViewCreated$1$1$1 encryptedBackupsSettingFragment$onViewCreated$1$1$1 = new EncryptedBackupsSettingFragment$onViewCreated$1$1$1(this.this$0, (0DR) obj4);
        encryptedBackupsSettingFragment$onViewCreated$1$1$1.L$0 = obj3;
        return encryptedBackupsSettingFragment$onViewCreated$1$1$1.invokeSuspend(04S.A00);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.8vA, androidx.fragment.app.Fragment, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        AKJ A01;
        int i5;
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        99Z r0 = (99Z) this.L$0;
        ?? r02 = this.this$0;
        11T.A0F(r0, 0);
        if (r0 instanceof C8tg) {
            Exception exc = ((C8tg) r0).A00;
            if (exc instanceof RemoveAllDevicesFromBackupException) {
                i = 2131956448;
                i2 = 2131956446;
                i3 = 2131956449;
                i4 = 2131956447;
                A01 = new AKJ((Object) r02, 3);
                i5 = 4;
            } else if (exc instanceof DeleteBackupException) {
                C8vA.A06(r02, AQo.A01(r02, 45), AQo.A01(r02, 46), 2131956439, 2131956437, 2131956440, 2131956438);
            } else if (exc instanceof RemoveVirtualDeviceException) {
                9lL r03 = r02.A01;
                if (r03 == null) {
                    11T.A0L("settingFlowLogger");
                    throw 0Q8.createAndThrow();
                }
                4YV.A0Z(r03.A06).flowMarkPoint(r03.A03, "SETTING_GOOGLE_STORAGE_TURN_OFF_FAILED");
                i = 2131956533;
                i2 = 2131956531;
                i3 = 2131956534;
                i4 = 2131956532;
                A01 = AQo.A01(r02, 49);
                i5 = 0;
            }
            C8vA.A06(r02, A01, new AKJ((Object) r02, i5), i, i2, i3, i4);
        } else if (r0 instanceof C8th) {
            Toast.makeText(r02.requireContext(), r02.getText(2131956470), 0).show();
        }
        this.this$0.A1c();
        return 04S.A00;
    }
}
