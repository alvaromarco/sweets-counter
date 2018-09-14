package com.deividasstr.domain.repositories

import com.deividasstr.domain.entities.ConsumedSweet
import io.reactivex.Completable
import io.reactivex.Single

interface ConsumedSweetsRepo {

    fun addSweet(sweet: ConsumedSweet): Completable

    fun getAllConsumedSweets(): Single<List<ConsumedSweet>>
}