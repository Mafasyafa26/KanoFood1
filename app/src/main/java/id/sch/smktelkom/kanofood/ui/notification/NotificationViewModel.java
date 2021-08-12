package id.sch.smktelkom.kanofood.ui.notification;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationViewModel extends ViewModel {
    private static LiveData<String> mText;

    public NotificationViewModel() {
        mText = new MutableLiveData<>();
        ((MutableLiveData<String>) mText).setValue("This is notification fragment");
    }

    public static LiveData<String> getText() {
        return mText;
    }
}
