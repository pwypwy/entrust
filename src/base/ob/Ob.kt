package base.ob

interface Ob {

    /**
     * 相遇
     */
    fun meet(others: List<Ob>){

    }

    /**
     * 分组
     */
    fun group(others: List<Ob>) {
        
    }

    /**
     * 接触
     */
    fun contact(x: Ob) {
        
    }

    /**
     * 观察
     */
    fun observe(x: Ob){

    }

}