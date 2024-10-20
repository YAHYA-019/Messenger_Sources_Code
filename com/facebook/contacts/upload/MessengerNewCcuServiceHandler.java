package com.facebook.contacts.upload;

import X.1BO;
import X.1BY;
import X.1Bn;
import X.1Se;
import X.7zL;
import X.AnonymousClass001;
import X.C15h;
import X.G7K;
import X.JQw;
import X.KmP;
import X.ML4;
import android.os.Bundle;
import com.facebook.contacts.interfaces.model.ContactsUploadState;
import com.facebook.contacts.server.UploadContactsResult;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;

/* loaded from: MessengerNewCcuServiceHandler.class */
public final class MessengerNewCcuServiceHandler implements ML4 {
    public 1Se A00;
    public OperationResult A01;
    public Boolean A02;
    public int A03;
    public 1BY A05;
    public final KmP A06 = (KmP) 1Bn.A0B(131242);
    public final C15h A07 = G7K.A01(this, 20);
    public UploadContactsResult A04 = new UploadContactsResult("dummy_import_id", AnonymousClass001.A0s());

    public MessengerNewCcuServiceHandler(1BO r302) {
        this.A05 = 7zL.A0Q(r302);
    }

    @Override // X.ML4
    public void Bkw(Bundle bundle) {
    }

    @Override // X.ML4
    public void Bkx(Bundle bundle) {
        ImmutableList immutableList;
        if (this.A00 != null) {
            UploadContactsResult uploadContactsResult = (UploadContactsResult) bundle.getParcelable("matched_contact");
            this.A04 = uploadContactsResult;
            int i = 0;
            if (uploadContactsResult != null && (immutableList = uploadContactsResult.A00) != null) {
                i = immutableList.size();
            }
            this.A00.A00(OperationResult.A04(ContactsUploadState.A00(bundle.getInt("processed_contact_count"), i, this.A03)));
        }
    }

    @Override // X.ML4
    public void BpS(Bundle bundle) {
    }

    @Override // X.ML4
    public void BpT(Bundle bundle) {
    }

    @Override // X.ML4
    public void Brx(Bundle bundle) {
        synchronized (this) {
        }
    }

    @Override // X.ML4
    public void Bry(Bundle bundle) {
        ImmutableList immutableList;
        if (!bundle.getBoolean("full_upload") || this.A00 == null) {
            return;
        }
        UploadContactsResult uploadContactsResult = (UploadContactsResult) bundle.getParcelable("matched_contact");
        this.A04 = uploadContactsResult;
        int i = 0;
        if (uploadContactsResult != null && (immutableList = uploadContactsResult.A00) != null) {
            i = immutableList.size();
        }
        this.A00.A00(OperationResult.A04(ContactsUploadState.A00(bundle.getInt("processed_contact_count"), i, this.A03)));
    }

    @Override // X.ML4
    public void CDL(Bundle bundle) {
    }

    @Override // X.ML4
    public void CDM(Bundle bundle) {
        synchronized (this) {
            this.A01 = OperationResult.A04(this.A04);
            this.A02 = AnonymousClass001.A0K();
            notify();
        }
    }

    @Override // X.ML4
    public void CDN(Bundle bundle) {
    }

    @Override // X.ML4
    public void CN1(Bundle bundle) {
        int i = bundle.getInt(JQw.A00(328));
        this.A03 = i;
        1Se r0 = this.A00;
        if (r0 != null) {
            r0.A00(OperationResult.A04(ContactsUploadState.A00(0, 0, i)));
        }
    }

    @Override // X.ML4
    public void CSo(Bundle bundle) {
        synchronized (this) {
            this.A01 = new OperationResult(AnonymousClass001.A0N(bundle.getString(TraceFieldType.FailureReason)));
            this.A02 = AnonymousClass001.A0K();
            notify();
        }
    }
}
