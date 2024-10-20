package com.facebook.contacts.upload;

import X.0fH;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1Bn;
import X.1Ho;
import X.1I7;
import X.1IB;
import X.1IC;
import X.1Kd;
import X.1Ql;
import X.1UN;
import X.1UP;
import X.7zR;
import X.AbE;
import X.AbF;
import X.AnonymousClass001;
import X.C09384py;
import X.C09864rq;
import X.C0dp;
import X.C0qy;
import X.C1kw;
import X.DKD;
import X.DeG;
import X.ELG;
import X.FwL;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.contacts.interfaces.model.ContactsUploadState;
import com.facebook.contacts.interfaces.model.ContactsUploadVisibility;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ContactsUploadRunner.class */
public final class ContactsUploadRunner implements 1UN {
    public ContactsUploadState A00;
    public ContactsUploadVisibility A01;
    public 1IC A02;
    public final C1kw A03;
    public final 1I7 A04;
    public final C0dp A05;
    public final C0qy A06;
    public final C09864rq A07;
    public final BlueServiceOperationFactory A08;
    public final FbSharedPreferences A09;
    public final Set A0A;

    public ContactsUploadRunner() {
        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0A(33031);
        1I7 r0 = (1I7) DKD.A0m(65728);
        FbSharedPreferences A0W = 1BL.A0W();
        C1kw c1kw = (C1kw) 1Bi.A03(16772);
        C0qy c0qy = (C0qy) 1Bi.A03(83603);
        C0dp A0G = 7zR.A0G();
        Set A0I = 1Bn.A0I(749);
        C09864rq c09864rq = (C09864rq) 1Bn.A0A(82436);
        this.A00 = new ContactsUploadState(ELG.A02, null, null, 0, 0, 0);
        this.A01 = ContactsUploadVisibility.HIDE;
        ((1UP) 1Bi.A03(66348)).A00(this);
        this.A08 = blueServiceOperationFactory;
        this.A04 = r0;
        this.A09 = A0W;
        this.A03 = c1kw;
        this.A06 = c0qy;
        this.A05 = A0G;
        this.A0A = A0I;
        this.A07 = c09864rq;
    }

    public static void A00(ContactsUploadState contactsUploadState, ContactsUploadRunner contactsUploadRunner) {
        ContactsUploadVisibility contactsUploadVisibility;
        synchronized (contactsUploadRunner) {
            contactsUploadRunner.A00 = contactsUploadState;
        }
        synchronized (contactsUploadRunner) {
            contactsUploadVisibility = contactsUploadRunner.A01;
        }
        Intent A05 = AbF.A05();
        A05.setAction(1BJ.A00(380));
        A05.putExtra("state", contactsUploadState);
        A05.putExtra("visibility", (Parcelable) contactsUploadVisibility);
        contactsUploadRunner.A04.CkS(A05);
        if (contactsUploadState.A03 == ELG.A04) {
            Iterator it = contactsUploadRunner.A0A.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("onContactsUploadSucceeded");
            }
        }
    }

    public void A01() {
        synchronized (this) {
            this.A01 = ContactsUploadVisibility.HIDE;
            A00(new ContactsUploadState(ELG.A02, null, null, 0, 0, 0), this);
        }
    }

    public void A02(ContactsUploadVisibility contactsUploadVisibility, String str) {
        synchronized (this) {
            contactsUploadVisibility.getClass();
            if (this.A02 != null) {
                0fH.A0m("com.facebook.contacts.upload.ContactsUploadRunner", "CCU: Already uploading, not uploading again");
                if (this.A01 == ContactsUploadVisibility.HIDE && contactsUploadVisibility == ContactsUploadVisibility.SHOW) {
                    0fH.A0m("com.facebook.contacts.upload.ContactsUploadRunner", "Upgrading visibility to show in UI.");
                    this.A01 = contactsUploadVisibility;
                    ContactsUploadState contactsUploadState = this.A00;
                    Intent A05 = AbF.A05();
                    A05.setAction(1BJ.A00(380));
                    A05.putExtra("state", contactsUploadState);
                    A05.putExtra("visibility", (Parcelable) contactsUploadVisibility);
                    this.A04.CkS(A05);
                }
            } else {
                this.A01 = contactsUploadVisibility;
                this.A00 = ContactsUploadState.A00(0, 0, 0);
                this.A07.A01(true);
                1Ql edit = this.A09.edit();
                edit.CaH(C09384py.A01, this.A05.now());
                edit.commit();
                Bundle A052 = 1BK.A05();
                A052.putBoolean("forceFullUploadAndTurnOffGlobalKillSwitch", true);
                A052.putString("messengerCILegalScreenSource", str);
                1Ho newInstance_DEPRECATED = this.A08.newInstance_DEPRECATED("contacts_upload_messaging", A052);
                newInstance_DEPRECATED.A03 = new DeG(this);
                1IB A00 = 1Ho.A00(newInstance_DEPRECATED, true);
                this.A02 = A00;
                1Kd.A0E(FwL.A00(this, 8), A00);
                A00(ContactsUploadState.A00(0, 0, 0), this);
            }
        }
    }

    public void AFz() {
        0fH.A0j("com.facebook.contacts.upload.ContactsUploadRunner", AbE.A00(254));
        A01();
    }
}
