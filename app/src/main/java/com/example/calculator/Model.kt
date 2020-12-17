package com.example.calculator

class Model () {
    private var text = StringBuilder()

    private var status: String
    private var oper: String
    private var arg1: Int
    private var arg2: Int



    init {
        text.append("0")
        status = "inputArg1"
        oper=""
        arg1=0
        arg2=0
    }

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
            R.id.buttonPlus -> clickOper("+")
            R.id.buttonMinus -> clickNum("0")
            R.id.buttonEquals -> clickEq()
            R.id.buttonDivided -> clickNum("0")
            R.id.buttonMultiplied -> clickNum("0")
            R.id.buttonClear -> clear()
            R.id.buttonMemoryPlus -> clickNum("0")
            R.id.buttonMemoryMinus -> clickNum("0")
            R.id.buttonMemoryClear -> clickNum("0")

        }


    }

    private fun clickPlus() {
        if (status=="inputArg2"){
            oper="+"
        }
        if (status=="inputOper"){

        }
    }

    private fun clickNum(btnValue: String) {
        if (text.get(text.lastIndex).toString().equals("0")and (text.length==1)){
            text.setLength(0)
        }
        text.append(btnValue)

        // TODO: 09.12.2020 if else 
        if (status=="inputArg1"){
            arg1=text.toString().toInt()
        }
        if (status=="inputArg2"){
            arg2=text.toString().toInt()
        }
        if (status=="inputOper"){
            var buf=text.get(text.lastIndex)
            text.setLength(0)
            text.append(buf)
            arg2=text.toString().toInt()
            status="inputArg2"
        }

    }

    private fun clickOper(btnValue: String){
        oper=btnValue


/*        if (status=="inputArg2"){
            oper=btnValue
        }
        if (status=="inputOper"){

        }*/
        status="inputOper"
    }
    private fun clickEq(){
        if (oper=="+"){
            text.clear()
            text.append((arg1.toInt()+arg2.toInt()).toString())
        }
    }

    fun showText(): StringBuilder {
        return text
    }

    fun clear() {
        text.setLength(0)
        text.append("0")
        status = "inputArg1"

    }


}