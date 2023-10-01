class Robot(var x: Int, var y: Int, var direction: Direction) {
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