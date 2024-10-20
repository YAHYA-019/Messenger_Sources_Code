package com.facebook.ipc.composer.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.5BB;
import X.AbG;
import X.AbJ;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.FJ8;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerAIRewriteState.class */
public final class ComposerAIRewriteState implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(93);
    public final ImmutableList A00;
    public final boolean A01;
    public final boolean A02;

    /* loaded from: ComposerAIRewriteState$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            boolean z = false;
            ImmutableList of = ImmutableList.of();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode != -2023177363) {
                            if (hashCode == 1921970492 && A1C.equals("has_opened_bottom_sheet")) {
                                z = abstractC01033pi.A1l();
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("undo_stack")) {
                                of = AbstractC11224vw.A00(abstractC01033pi, c27t, GraphQLTextWithEntities.class);
                                C1pq.A08("undoStack", of);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ComposerAIRewriteState.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ComposerAIRewriteState(of, z);
        }
    }

    /* loaded from: ComposerAIRewriteState$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ComposerAIRewriteState composerAIRewriteState = (ComposerAIRewriteState) obj;
            r302.A0b();
            boolean z = composerAIRewriteState.A01;
            r302.A0o("has_opened_bottom_sheet");
            r302.A0v(z);
            AbstractC11224vw.A06(r302, c26c, "undo_stack", composerAIRewriteState.A00);
            r302.A0Y();
        }
    }

    public ComposerAIRewriteState(Parcel parcel) {
        this.A01 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A02 = AbJ.A1W(parcel);
        this.A00 = FJ8.A02(parcel);
    }

    public ComposerAIRewriteState(ImmutableList immutableList, boolean z) {
        this.A01 = z;
        this.A02 = false;
        C1pq.A08("undoStack", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerAIRewriteState)) {
                return false;
            }
            ComposerAIRewriteState composerAIRewriteState = (ComposerAIRewriteState) obj;
            if (this.A01 != composerAIRewriteState.A01 || this.A02 != composerAIRewriteState.A02 || !11T.A0O(this.A00, composerAIRewriteState.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A02(C1pq.A05(this.A01), this.A02));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComposerAIRewriteState{hasOpenedBottomSheet=");
        A0k.append(this.A01);
        A0k.append(", isGeneratingResponse=");
        A0k.append(this.A02);
        A0k.append(", undoStack=");
        A0k.append(this.A00);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        FJ8.A0B(parcel, this.A00);
    }
}
