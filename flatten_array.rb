#Simple method to flatten an array of arrays ie [[1,2,[3]],4] -> [1,2,3,4]

def flatten_array(array)

	flat = array.flatten
	
	return flat
end


array_to_flatten = [[1, 2, [3]], 4]
puts "Array before flattening: #{array_to_flatten}"

flat_array = flatten_array(array_to_flatten)

puts "Array after flattening: #{flat_array}"
