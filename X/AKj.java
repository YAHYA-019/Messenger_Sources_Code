package X;

import com.facebook.xapp.messaging.contentsearch.messengerexternalmedia.model.MessengerExternalMediaResource;

/* loaded from: AKj.class */
public final class AKj extends C00q implements C00m {
    public final /* synthetic */ 4NU $hasSearchText;
    public final /* synthetic */ int $index;
    public final /* synthetic */ MessengerExternalMediaResource $model;
    public final /* synthetic */ int $selectedTab;
    public final /* synthetic */ 8iE this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKj(4NU r302, 8iE r303, MessengerExternalMediaResource messengerExternalMediaResource, int i, int i2) {
        super(0);
        this.this$0 = r303;
        this.$model = messengerExternalMediaResource;
        this.$index = i;
        this.$hasSearchText = r302;
        this.$selectedTab = i2;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        8iE.A0L(this.$hasSearchText, this.this$0, this.$model, this.$selectedTab);
        return 04S.A00;
    }
}
