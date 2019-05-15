package com.medicine.medicinetime.alarm;

import com.medicine.medicinetime.BasePresenter;
import com.medicine.medicinetime.BaseView;
import com.medicine.medicinetime.data.source.History;
import com.medicine.medicinetime.data.source.MedicineAlarm;

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
