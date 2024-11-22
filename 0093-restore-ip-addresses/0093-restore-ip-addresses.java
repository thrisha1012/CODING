class Solution {
    public List<String> restoreIpAddresses(final String s) {
        if(s.length() < 4 || s.length() > 12)
            return List.of();

        final List<String> result = new ArrayList<>();

        backTrack(result, new StringBuilder(), s, 0, 0);

        return result;
    }

    private void backTrack(
        final List<String> result,
        final StringBuilder address,
        final String s,
        final int start,
        final int count) {
        if(start >= s.length() && count == 4) {
            result.add(address.substring(0, address.length() - 1));
            return;
        }

        if(s.length() - start > 3 * (4 - count))
            return;

        final int begining = address.length();

        for(int i = start; i < Math.min(start + 3, s.length()); ++i) {
            address.append(s.charAt(i));

            final String number = address.substring(begining, address.length());

            if(Integer.valueOf(number) <= 255) {
                address.append('.');
                backTrack(result, address, s, i + 1, count + 1);
                address.setLength(address.length() - 1);
            }

            if(number.equals("0"))
                break;
        }

        address.setLength(begining);
    }
}