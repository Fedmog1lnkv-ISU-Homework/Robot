class Robot(private var _x: Int, private var _y: Int, private var _direction: Direction) {
    var x: Int
        get() = _x
        private set(value) {
            _x = value
        }

    var y: Int
        get() = _y
        private set(value) {
            _y = value
        }

    var direction: Direction
        get() = _direction
        private set(value) {
            _direction = value
        }

    fun turnLeft() {
        direction = when (direction) {
            Direction.UP -> Direction.LEFT
            Direction.DOWN -> Direction.RIGHT
            Direction.RIGHT -> Direction.UP
            Direction.LEFT -> Direction.DOWN
        }
    }

    fun turnRight() {
        direction = when (direction) {
            Direction.UP -> Direction.RIGHT
            Direction.DOWN -> Direction.LEFT
            Direction.RIGHT -> Direction.DOWN
            Direction.LEFT -> Direction.UP
        }
    }

    fun stepForward() {
        when (direction) {
            Direction.UP -> y++
            Direction.DOWN -> y--
            Direction.RIGHT -> x++
            Direction.LEFT -> x--
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"
    }
}
