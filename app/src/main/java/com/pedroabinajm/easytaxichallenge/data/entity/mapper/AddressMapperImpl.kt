package com.pedroabinajm.easytaxichallenge.data.entity.mapper


import android.location.Address
import com.pedroabinajm.easytaxichallenge.data.model.EasyPlace
import java.util.*
import javax.inject.Inject

class AddressMapperImpl @Inject constructor() : AddressMapper {
    override fun transform(address: Address): EasyPlace {
        return EasyPlace(
                UUID.randomUUID().toString(),
                address.premises?.let { it } ?: listOf(address.thoroughfare, address.subThoroughfare).joinToString(separator = ", "),
                address.latitude,
                address.longitude,
                listOf(address.subLocality, address.subAdminArea).joinToString(separator = ", "),
                false
        )
    }
}
