package com.imyeego.test

class WmdaLogHelper {

    companion object {

        @JvmStatic
        fun addLog(id: Long?, param: Map<String, *>?) {
            id?.takeIf { param != null && param.isNotEmpty() }?.let {
                val time = System.currentTimeMillis();

            }
        }
    }
}