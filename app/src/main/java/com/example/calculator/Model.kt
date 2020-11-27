package com.example.calculator

class Model {
    private val text = StringBuilder()

    //var text: String =" "
    fun click(id: Any) {

        when (id) {
            R.id.button1 -> clickNum("1")
            R.id.button2 -> clickNum("2")
            R.id.button3 -> clickNum("3")
            R.id.button4 -> clickNum("4")
            R.id.button5 -> clickNum("5")
            R.id.button6 -> clickNum("6")
            R.id.button7 -> clickNum("7")
            R.id.button8 -> clickNum("8")
            R.id.button9 -> clickNum("9")
            R.id.button0 -> clickNum("0")
            R.id.buttonComma -> clickNum("0")
            R.id.buttonPlus -> clickNum("0")
            R.id.buttonMinus -> clickNum("0")
            R.id.buttonEquals -> clickNum("0")
            R.id.buttonDivided -> clickNum("0")
            R.id.buttonMultiplied -> clickNum("0")
            R.id.buttonClear -> clear()
            R.id.buttonMemoryPlus -> clickNum("0")
            R.id.buttonMemoryMinus -> clickNum("0")
            R.id.buttonMemoryClear -> clickNum("0")

        }


    }

    private fun clickNum(btnValue: String) {

        if (text.equals("0")){
            text.setLength(0)
                //todo переделать
        }
        //text = btnValue
        text.append(btnValue)
    }

    fun showText(): StringBuilder {
        return text
    }

    fun clear() {
        text.setLength(0)
        text.append("0")
    }


}