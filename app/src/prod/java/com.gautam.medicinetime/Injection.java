package com.medicine.medicinetime;

import android.content.Context;
import android.support.annotation.NonNull;


import com.medicine.medicinetime.data.source.MedicineRepository;
import com.medicine.medicinetime.data.source.local.MedicinesLocalDataSource;


/**
 * Created by medicine on 13/05/17.
 */

public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}